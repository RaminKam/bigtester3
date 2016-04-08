package testergui.testerframeforteacher.testmanagerpanel.actspanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class ActsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ActsPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JButton button = new JButton("<");
		panel.add(button);
		
		JButton button_1 = new JButton(">");
		panel.add(button_1);

	}

}
