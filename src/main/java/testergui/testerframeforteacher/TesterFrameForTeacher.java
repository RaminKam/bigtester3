package testergui.testerframeforteacher;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.BoxLayout;


//Project imports:
import testergui.testerframeforteacher.testmanagerpanel.TestManagerPanel;
import testergui.testerframeforteacher.teachersjournalpanel.TeachersJournalPanel;
public class TesterFrameForTeacher extends JFrame {

	JPanel contentPane;
	TestManagerPanel testManagerPanel;
	JPanel statusPanel;
	TeachersJournalPanel teachersJournalPanel;
	JPanel teacherStatisticPanel;
	JLabel statusLabel;
	JMenuBar menuBar;
	JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TesterFrame frame = new TesterFrame();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public TesterFrameForTeacher() {
		setTitle("Tester");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//hadler close in linker
		setBounds(0, 0, 738, 493);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		testManagerPanel = new TestManagerPanel();//new JPanel();
		tabbedPane.addTab("Teacher's test manager", null, testManagerPanel, null);
		
		teachersJournalPanel = new TeachersJournalPanel();
		tabbedPane.addTab("Teacher's journal", null, teachersJournalPanel, null);
		
		teacherStatisticPanel = new JPanel();
		tabbedPane.addTab("Statistic for teacher", null, teacherStatisticPanel, null);
		
		statusPanel = new JPanel();
		contentPane.add(statusPanel, BorderLayout.SOUTH);
		statusPanel.setLayout(new BorderLayout(0, 0));
		
		statusLabel = new JLabel("Progress status:");
		statusPanel.add(statusLabel, BorderLayout.EAST);
		setVisible(true);
		//setLocationRelativeTo(null);						//Sets frame position in center of screen
		pack();
	}

	public TestManagerPanel getTestManagerPanel() {
		return testManagerPanel;
	}
	public JLabel getStatusLabel() {
		return statusLabel;
	}
}
