package testergui.testerframeforteacher.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import hibernate.db.Test;
/*This is model for table in choice table model.
 * It's here don't seen that it's in handers of testerframeforteacher
 * because in future it will be part of more big data model of all frame
 * where will be another data needed for another functions.
 * 
 * */
public class ChoiceTestTableModel extends AbstractTableModel{
	List<Test> tests=null;
	public List<Test> getTests(){
		return tests;
	}
	ChoiceTestTableModel(List<Test> tests){
		super();
		if(tests==null)
			return;
		this.tests=tests;
		bls=new ArrayList<Object>();
		bls.add(new Boolean(true));
		for(int r=1;r<tests.size();r++)
			bls.add(new Boolean(false));
		selectedTest=tests.get(0);
	}
	protected ArrayList <Object>bls;
	private Test selectedTest=null; 
	public Test getSelectedTest(){			
		return selectedTest;
	}

	public int getRowCount(){	
		if(tests==null)
			return 0;
		return tests.size();
	}
	public int getColumnCount(){
		return 4;
	}
	public Object getValueAt(int row, int col)
	{
		//If da empty for needed data:
		if(tests==null)
			return null;
		//Next data is there truly
		switch(col)
		{
		case 0:
			return new Integer(row+1);
			
		case 1:
			return tests.get(row).getName();
		case 2:
			int valAcc=tests.get(row).getAccess();
			Boolean bvalAcc=new Boolean(true);
			if(valAcc>0)
				bvalAcc=new Boolean(true);
			else
				bvalAcc=new Boolean(false);
			return bvalAcc;
		case 3:
			return bls.get(row);
		};
		return null;
	}
	public void setValueAt(Object value, int row, int col){
		for(int k=0;k<tests.size();k++){
			if(k!=row)
				bls.set(k, new Boolean(false));
		}
		bls.set(row, value);
		selectedTest=tests.get(row);
		fireTableDataChanged();												//It's foe faster update view of table, because withoit it repaint longer than must do it
	}
	public boolean isCellEditable(int row, int col){
		if(col==3)
			return true;
		return false;
	}
	public Class getColumnClass(int col){
		switch(col){
		case 0:
			return new Integer(3).getClass();
		case 1:
			return new String("").getClass();
		case 2:
			return new Boolean(true).getClass();
		case 3:
			return bls.get(0).getClass();
		};
		return null;
	}
	public String getColumnName(int col){
		switch(col){
		case 0:
			return new String("\u2116");
		case 1:
			return new String("Name");
		case 2:
			return new String("Access");
		case 3:
			return new String("Choice");
		};
		return new String("?");
	}
};