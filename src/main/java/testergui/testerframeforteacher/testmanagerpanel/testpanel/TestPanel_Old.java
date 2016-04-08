package testergui.testerframeforteacher.testmanagerpanel.testpanel;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.BoxLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;

public class TestPanel_Old extends JPanel {
	private JLabel fullTestNameLabel;
	private JTable table;
	private JButton addQuesBankButton;
	private JButton saveAsTestButton;
	private JButton removeTestButton;
	private JButton openTestButton;
	private JButton saveTestButton;
	private JButton forwardButton;
	private JButton downButton;
	private JButton removeButton;
	private JButton addButton;

	/**
	 * Create the panel.
	 */
	public TestPanel_Old() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		fullTestNameLabel = new JLabel("Test name");
		panel.add(fullTestNameLabel);
		
		saveTestButton = new JButton("Save test");
		panel.add(saveTestButton);
		
		openTestButton = new JButton("Open test");
		panel.add(openTestButton);
		
		removeTestButton = new JButton("Remove test");
		panel.add(removeTestButton);
		
		saveAsTestButton = new JButton("Save as test");
		panel.add(saveAsTestButton);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.SOUTH);
		
		addQuesBankButton = new JButton("Add questions from bank");
		panel_4.add(addQuesBankButton);
		
		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(350, 300));
		panel_5.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), Boolean.TRUE, new Integer(2), "Whaner?"},
				{new Integer(2), Boolean.TRUE, new Integer(33), "haner?haner?haner?"},
				{new Integer(3), Boolean.TRUE, new Integer(4), "haner?haner?haner?"},
				{new Integer(4), Boolean.TRUE, new Integer(4), null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u2116", "Use", "Hard", "Text"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Boolean.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(29);
		table.getColumnModel().getColumn(1).setPreferredWidth(33);
		table.getColumnModel().getColumn(2).setPreferredWidth(34);
		table.getColumnModel().getColumn(3).setPreferredWidth(303);
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(7, 1, 0, 0));
		
		forwardButton = new JButton("Forward");
		panel_6.add(forwardButton);
		
		downButton = new JButton("Down");
		panel_6.add(downButton);
		
		removeButton = new JButton("Remove");
		panel_6.add(removeButton);
		
		addButton = new JButton("Add");
		panel_6.add(addButton);

	}

}
