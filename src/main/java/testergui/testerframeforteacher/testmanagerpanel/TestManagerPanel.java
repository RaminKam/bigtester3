package testergui.testerframeforteacher.testmanagerpanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


//Project imports:
import testergui.testerframeforteacher.testmanagerpanel.actspanel.ActsPanel;
import testergui.testerframeforteacher.testmanagerpanel.questionpanel.QuestionPanel;
import testergui.testerframeforteacher.testmanagerpanel.testpanel.TestPanel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollBar;
public class TestManagerPanel extends JPanel {
	private JSplitPane leftSplitPane;
	private JScrollPane scrollPane;
	private JSplitPane rightSplitPane;
	private TestPanel testPanel;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private QuestionPanel questionPanel;
	private ActsPanel actsPanel;

	/**
	 * Create the panel.
	 */
	public TestManagerPanel() {
		setLayout(new BorderLayout(0, 0));
		
		leftSplitPane = new JSplitPane();
		leftSplitPane.setResizeWeight(0.3);
		leftSplitPane.setDividerSize(3);
		add(leftSplitPane, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		leftSplitPane.setLeftComponent(scrollPane);
		
		testPanel = new TestPanel();
		scrollPane.setViewportView(testPanel);
		
		rightSplitPane = new JSplitPane();
		rightSplitPane.setResizeWeight(1.0);
//		rightSplitPane.addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentResized(ComponentEvent e) {
//				EventQueue.invokeLater(new Runnable() {
//					public void run() {
//						try {
//							repaintViewInRightSplit();
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//					}
//				});
//			}
//		});
		rightSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		rightSplitPane.setDividerSize(3);
		leftSplitPane.setRightComponent(rightSplitPane);
		
		scrollPane_1 = new JScrollPane();
		rightSplitPane.setLeftComponent(scrollPane_1);
		
		questionPanel = new QuestionPanel();
		scrollPane_1.setViewportView(questionPanel);
		
		scrollPane_2 = new JScrollPane();
		rightSplitPane.setRightComponent(scrollPane_2);
		
		actsPanel = new ActsPanel();
		scrollPane_2.setViewportView(actsPanel);
		
		

	}
	
	private void repaintViewInRightSplit(){									//It's for constant size of separated slpit pane
		int m=rightSplitPane.getHeight();
		if(m>44)
			rightSplitPane.setDividerLocation(m-44);
		else
			rightSplitPane.setDividerLocation(m/2);

	}


	public TestPanel getTestPanel() {
		return testPanel;
	}
}
