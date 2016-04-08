package testergui.testerframeforteacher.handlers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import hibernate.db.HibernateUtil;
import testergui.testerframeforteacher.TesterFrameForTeacher;

import hibernate.db.*;
public class TesterFrameForTeacher_Linker {
	Teacher currTeacher;
	TesterFrameForTeacher tester;
	TesterFrameForTeacherModel testerData;
	public TesterFrameForTeacher_Linker(TesterFrameForTeacher tester,Teacher currTeacher){
		this.tester=tester;
		this.currTeacher=currTeacher;
		tester.addWindowListener(new WindowAdapter(){										//to on close frame and close db connection
			public void windowClosing(WindowEvent ev){
				System.out.println("Close testerframeforteacher");
				HibernateUtil.getSessionFactory().close();
				System.exit(0);
			}
		});
		
		//[1]: Handler Open Test button:
		//It  1)gets data from database 2)creates new JDialog 3)Returns selected test to parent frame
		OpenTest_JButton_TesterFrameForTeacher_Handler open_test_handler=new OpenTest_JButton_TesterFrameForTeacher_Handler(tester,currTeacher);
		tester.getTestManagerPanel().getTestPanel().getBtn_Open().addActionListener(open_test_handler);
		
		
	}
//	public void reviewQuestionsTable(ArrayList<Question> questions){
//		tester.getTestManagerPanel().getTestPanel().getTable_questions();
//	}
	public Teacher getCurrentTeacher(){
		return currTeacher;
	}

}
