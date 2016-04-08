package testergui.authframe.handlers;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import hibernate.db.HibernateUtil;
//Project imports:
import testergui.authframe.AuthFrame;
public class AuthFrame_Linker {
	public AuthFrame_Linker(AuthFrame authFrame){	
		
		AuthFrame_Register_but_Handler han=new AuthFrame_Register_but_Handler(authFrame);		//to register
		authFrame.getRegister_JButton().addActionListener(han);
		
		AuthFrame_LogIn_but_Handler han2=new AuthFrame_LogIn_but_Handler(authFrame);			//to log in
		authFrame.getLogIn_JButton().addActionListener(han2);
		
		authFrame.addWindowListener(new WindowAdapter(){										//to on close frame and close db connection
			public void windowClosing(WindowEvent ev){
				System.out.println("Close authFrame");
				
				try{HibernateUtil.getSessionFactory().close();}
				catch(Exception ex){
					System.out.println(ex);
					System.exit(0);
				}
				System.exit(0);
			}
		});
			

			
	
	}

}
