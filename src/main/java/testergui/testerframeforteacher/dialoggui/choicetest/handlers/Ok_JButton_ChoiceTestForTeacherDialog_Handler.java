package testergui.testerframeforteacher.dialoggui.choicetest.handlers;

import java.awt.EventQueue;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import testergui.testerframeforteacher.TesterFrameForTeacher;
import testergui.testerframeforteacher.dialoggui.choicetest.ChoiceTestForTeacherDialog;
import testergui.testerframeforteacher.handlers.ChoiceTestTableModel;
import hibernate.db.*;
import hibernate.dbacts.DBActs;
//After clicks on Ok button need to do:
//1)Close dialog
//2)Give to parent frame information about teacher's test(Object Test)
public class Ok_JButton_ChoiceTestForTeacherDialog_Handler implements ActionListener, Runnable{
	Thread th;
	TesterFrameForTeacher teachFrame;
	ChoiceTestForTeacherDialog dialog;
	Test selectedTest;
	List<Test> tests=null;
	ChoiceTestTableModel mod;
	public Ok_JButton_ChoiceTestForTeacherDialog_Handler(TesterFrameForTeacher teachFrame,ChoiceTestForTeacherDialog dialog){
		this.teachFrame=teachFrame;
		this.dialog=dialog;
	}
	public void actionPerformed(ActionEvent ev){
		th=new Thread(this);
		th.start();
	}
	public void run(){										//Attention!! invokeAndWait needed!
		try {
			EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					mod = (ChoiceTestTableModel) dialog.getTable().getModel();
					tests = mod.getTests();
					for (int i = 0; i < mod.getRowCount(); i++) {
						System.out.println("valeu=" + (Boolean) mod.getValueAt(i, 3));
						if ((Boolean) mod.getValueAt(i, 3)) {
							selectedTest = tests.get(i);
						}
					}
					;
					dialog.dispose();
					teachFrame.getTestManagerPanel().getTestPanel().getFullTestName_JLabel()
							.setText(selectedTest.getName());
					teachFrame.getStatusLabel().setText("Status = work with db");

				}
			});
		} catch (Exception e) {
			System.out.println(e);
		}
		final List <Question> questions=DBActs.getListQuestionsForTest(selectedTest.getId_test());
		
		class QuestionsTableModel extends AbstractTableModel{
			List <Question> quests=null;
			QuestionsTableModel(List <Question> quests){
				super();
				if(quests==null)
					return;
				this.quests=quests;
			}


			public int getRowCount(){	
				if(quests==null)
					return 0;
				return quests.size();
			}
			public int getColumnCount(){
				return 4;
			}
			public Object getValueAt(int row, int col)
			{
				//If da empty for needed data:
				if(quests==null)
					return null;
				//Next data is there truly
				switch(col)
				{
				case 0:
					return new Integer(row+1);
					
				case 1:
					int valAcc=quests.get(row).getQues_using();
					Boolean bvalAcc=new Boolean(true);
					if(valAcc>0)
						bvalAcc=new Boolean(true);
					else
						bvalAcc=new Boolean(false);
					return bvalAcc;
				case 2:
					return quests.get(row).getQues_hard();
				case 3:
					return quests.get(row).getQues_text();
				};
				return null;
			}
			public void setValueAt(Object value, int row, int col){
											
			}
			public boolean isCellEditable(int row, int col){
				return false;
			}
			public Class getColumnClass(int col){
				switch(col){
				case 0:
					return new Integer(3).getClass();
				case 1:
					return new Boolean(true).getClass();
				case 2:
					return new Integer(4).getClass();
				case 3:
					return new String("").getClass();
				};
				return null;
			}
			public String getColumnName(int col){
				switch(col){
				case 0:
					return new String("\u2116");
				case 1:
					return new String("Using");
				case 2:
					return new String("Hard");
				case 3:
					return new String("Text");
				};
				return new String("?");
			}
		};
		try {
			EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					teachFrame.getTestManagerPanel().getTestPanel().getTable_questions().setModel(new QuestionsTableModel(questions));
					teachFrame.getStatusLabel().setText("Status = you work");
					

				}
			});
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
