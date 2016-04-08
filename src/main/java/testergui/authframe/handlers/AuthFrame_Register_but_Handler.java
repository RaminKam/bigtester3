package testergui.authframe.handlers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import testergui.authframe.dialoggui.reqforreg.ReqForRegDialog;
public class AuthFrame_Register_but_Handler implements ActionListener{
	ReqForRegDialog dialog;
	JFrame pFrame;
	public AuthFrame_Register_but_Handler(JFrame pFrame){
		this.pFrame=pFrame;
	}
	public void actionPerformed(ActionEvent e){
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				dialog=new ReqForRegDialog(pFrame);
				

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}
}
