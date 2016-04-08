package testergui.authframe.handlers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

//Project imports:
import testergui.authframe.AuthFrame;
import testergui.testerframeforstudent.TesterFrameForStudent;
import testergui.testerframeforstudent.handlers.TesterFrameForStudent_Linker;
import testergui.testerframeforteacher.TesterFrameForTeacher;
import testergui.testerframeforteacher.handlers.TesterFrameForTeacher_Linker;
import hibernate.db.*;
import hibernate.dbacts.DBActs;

public class AuthFrame_LogIn_but_Handler implements ActionListener {
	AuthFrame frame;
	TesterFrameForTeacher tester;
	TesterFrameForStudent testerstud;


	public AuthFrame_LogIn_but_Handler(AuthFrame frame) {
		this.frame = frame;
		
	}


	public void actionPerformed(ActionEvent e) {
		String login = frame.getLogin_JTextField().getText();
		String password = new String(frame.getPassword_JPasswordField().getPassword());
		Integer[] res = new Integer[] { null };
		Student[] stud = new Student[] { null };
		final Teacher[] teach = new Teacher[] { null };
		DBActs.auth_user(login, password, res, stud, teach);
		System.out.println(login + " " + password + " " + res[0]);
		if (res[0] == 0) {
			System.out.println("Can not find this user");
			return;
		}

		if (res[0] == 1) {// it's teacher
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						tester = new TesterFrameForTeacher();
						
						TesterFrameForTeacher_Linker tester_linker = new TesterFrameForTeacher_Linker(tester,teach[0]);
						frame.setVisible(false);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} else {// it's student

			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						testerstud = new TesterFrameForStudent();

						TesterFrameForStudent_Linker tester_linker = new TesterFrameForStudent_Linker(testerstud);
						frame.setVisible(false);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
