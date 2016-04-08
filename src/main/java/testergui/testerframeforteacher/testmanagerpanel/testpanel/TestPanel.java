package testergui.testerframeforteacher.testmanagerpanel.testpanel;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class TestPanel extends JPanel {
	private JTable table_questions;
	private JButton btn_Copy;
	private JButton btn_Add;
	private JButton btn_Remove_question;
	private JButton btn_Down;
	private JButton btn_Up;
	private JButton btn_Add_questions_from_bank;
	private JButton btn_Save;
	private JButton btn_Save_as;
	private JButton btn_Remove_test;
	private JButton btn_Open;
	private JTextArea fullTestName_JLabel;

	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setPreferredSize(new Dimension(385, 600));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[]{32, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0};
		setLayout(gridBagLayout);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setMinimumSize(new Dimension(120, 60));
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 0;
		add(scrollPane_1, gbc_scrollPane_1);
		
		fullTestName_JLabel = new JTextArea();
		fullTestName_JLabel.setText("fullName/Name");
		fullTestName_JLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
		fullTestName_JLabel.setEditable(false);
		fullTestName_JLabel.setRows(2);
		scrollPane_1.setViewportView(fullTestName_JLabel);
		
		btn_Open = new JButton("Open");
		GridBagConstraints gbc_btn_Open = new GridBagConstraints();
		gbc_btn_Open.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Open.gridx = 1;
		gbc_btn_Open.gridy = 0;
		add(btn_Open, gbc_btn_Open);
		
		btn_Remove_test = new JButton("Remove");
		GridBagConstraints gbc_btn_Remove_test = new GridBagConstraints();
		gbc_btn_Remove_test.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Remove_test.gridx = 2;
		gbc_btn_Remove_test.gridy = 0;
		add(btn_Remove_test, gbc_btn_Remove_test);
		
		btn_Save_as = new JButton("Save as");
		GridBagConstraints gbc_btn_Save_as = new GridBagConstraints();
		gbc_btn_Save_as.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Save_as.gridx = 3;
		gbc_btn_Save_as.gridy = 0;
		add(btn_Save_as, gbc_btn_Save_as);
		
		btn_Save = new JButton("Save");
		GridBagConstraints gbc_btn_Save = new GridBagConstraints();
		gbc_btn_Save.insets = new Insets(0, 0, 5, 0);
		gbc_btn_Save.gridx = 4;
		gbc_btn_Save.gridy = 0;
		add(btn_Save, gbc_btn_Save);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(1.0);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.insets = new Insets(0, 0, 5, 0);
		gbc_splitPane.gridwidth = 0;
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 1;
		add(splitPane, gbc_splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		table_questions = new JTable();
		table_questions.setModel(new DefaultTableModel(
				null,
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
//		table_questions.setModel(new DefaultTableModel(
//			new Object[][] {
//				{new Integer(1), Boolean.TRUE, new Integer(2), "When"},
//				{new Integer(2), Boolean.TRUE, new Integer(3), "KolKolKol"},
//				{new Integer(3), Boolean.TRUE, new Integer(4), "KolKol"},
//				{new Integer(4), Boolean.TRUE, new Integer(5), "KolKol"},
//				{new Integer(5), Boolean.FALSE, new Integer(6), "KolKol"},
//			},
//			new String[] {
//				"\u2116", "Use", "Hard", "Text"
//			}
//		) {
//			Class[] columnTypes = new Class[] {
//				Integer.class, Boolean.class, Integer.class, String.class
//			};
//			public Class getColumnClass(int columnIndex) {
//				return columnTypes[columnIndex];
//			}
//		});
		table_questions.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_questions.getColumnModel().getColumn(1).setPreferredWidth(31);
		table_questions.getColumnModel().getColumn(2).setPreferredWidth(34);
		table_questions.getColumnModel().getColumn(3).setPreferredWidth(112);
		scrollPane.setViewportView(table_questions);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWeights = new double[]{0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		btn_Up = new JButton("Up");

		GridBagConstraints gbc_btn_Up = new GridBagConstraints();
		gbc_btn_Up.fill = GridBagConstraints.BOTH;
		gbc_btn_Up.insets = new Insets(0, 0, 5, 0);
		gbc_btn_Up.gridx = 0;
		gbc_btn_Up.gridy = 0;
		panel.add(btn_Up, gbc_btn_Up);
		
		btn_Down = new JButton("Down");
		GridBagConstraints gbc_btn_Down = new GridBagConstraints();
		gbc_btn_Down.fill = GridBagConstraints.BOTH;
		gbc_btn_Down.insets = new Insets(0, 0, 5, 0);
		gbc_btn_Down.gridx = 0;
		gbc_btn_Down.gridy = 1;
		panel.add(btn_Down, gbc_btn_Down);
		
		btn_Remove_question = new JButton("Remove");
		GridBagConstraints gbc_btn_Remove_question = new GridBagConstraints();
		gbc_btn_Remove_question.fill = GridBagConstraints.BOTH;
		gbc_btn_Remove_question.insets = new Insets(0, 0, 5, 0);
		gbc_btn_Remove_question.gridx = 0;
		gbc_btn_Remove_question.gridy = 2;
		panel.add(btn_Remove_question, gbc_btn_Remove_question);
		
		btn_Add = new JButton("Add");
		GridBagConstraints gbc_btn_Add = new GridBagConstraints();
		gbc_btn_Add.fill = GridBagConstraints.BOTH;
		gbc_btn_Add.insets = new Insets(0, 0, 5, 0);
		gbc_btn_Add.gridx = 0;
		gbc_btn_Add.gridy = 3;
		panel.add(btn_Add, gbc_btn_Add);
		
		btn_Copy = new JButton("Copy");
		GridBagConstraints gbc_btn_Copy = new GridBagConstraints();
		gbc_btn_Copy.fill = GridBagConstraints.BOTH;
		gbc_btn_Copy.gridx = 0;
		gbc_btn_Copy.gridy = 4;
		panel.add(btn_Copy, gbc_btn_Copy);
		
		btn_Add_questions_from_bank = new JButton("Add questions from bank");
		GridBagConstraints gbc_btn_Add_questions_from_bank = new GridBagConstraints();
		gbc_btn_Add_questions_from_bank.gridwidth = 0;
		gbc_btn_Add_questions_from_bank.insets = new Insets(0, 0, 0, 5);
		gbc_btn_Add_questions_from_bank.gridx = 0;
		gbc_btn_Add_questions_from_bank.gridy = 2;
		add(btn_Add_questions_from_bank, gbc_btn_Add_questions_from_bank);

	}

	public JButton getBtn_Open() {
		return btn_Open;
	}
	public JTable getTable_questions() {
		return table_questions;
	}
	public JTextArea getFullTestName_JLabel() {
		return fullTestName_JLabel;
	}
}
