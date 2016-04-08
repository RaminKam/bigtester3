package mainpack;
//Java imports:
import java.awt.event.*;
import java.awt.*;

//Project imports:
import testergui.authframe.AuthFrame;
import testergui.authframe.handlers.AuthFrame_Linker;
import hibernate.db.*;

public class Main {
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				AuthFrame authFrame = new AuthFrame();
				authFrame.setVisible(true);


				
				AuthFrame_Linker allAppLinker=new AuthFrame_Linker(authFrame);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
		
		
	}

}
