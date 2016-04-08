package testergui.testerframeforteacher.handlers;
import hibernate.db.*;
public class TesterFrameForTeacherModel {
	public TesterFrameForTeacherModel(){
		
	}
	private Test currentTest=null;
	public void setCurrentTest(Test currentTest){
		this.currentTest=currentTest;
	}
}
