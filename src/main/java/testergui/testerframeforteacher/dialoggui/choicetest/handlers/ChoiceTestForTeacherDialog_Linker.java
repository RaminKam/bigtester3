package testergui.testerframeforteacher.dialoggui.choicetest.handlers;

import java.awt.EventQueue;

import testergui.testerframeforteacher.TesterFrameForTeacher;
import testergui.testerframeforteacher.dialoggui.choicetest.ChoiceTestForTeacherDialog;

public class ChoiceTestForTeacherDialog_Linker {
	ChoiceTestForTeacherDialog dialog;
	TesterFrameForTeacher teachFrame;
	public ChoiceTestForTeacherDialog_Linker(TesterFrameForTeacher teachFrame,ChoiceTestForTeacherDialog dialog){
		this.dialog=dialog;
		this.teachFrame=teachFrame;
		init();
	}
	public void init(){
		
		//
		Ok_JButton_ChoiceTestForTeacherDialog_Handler han=new Ok_JButton_ChoiceTestForTeacherDialog_Handler(teachFrame,dialog);
		dialog.getOkButton().addActionListener(han);

	}

}
