package testergui.testerframeforstudent.handlers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import hibernate.db.HibernateUtil;
import testergui.testerframeforstudent.TesterFrameForStudent;

public class TesterFrameForStudent_Linker {
	public TesterFrameForStudent_Linker(TesterFrameForStudent frame){
		frame.addWindowListener(new WindowAdapter(){										//to on close frame and close db connection
			public void windowClosing(WindowEvent ev){
				System.out.println("Close studFrame");
				HibernateUtil.getSessionFactory().close();
				System.exit(0);
			}
		});
	}

}
