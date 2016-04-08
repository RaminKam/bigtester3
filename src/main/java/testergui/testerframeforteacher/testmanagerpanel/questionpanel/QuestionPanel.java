package testergui.testerframeforteacher.testmanagerpanel.questionpanel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.Font;

public class QuestionPanel extends JPanel {
	private JRadioButton rdbtn_field_type;
	private JTextField textField_answer;
	private JButton btn_Add_multidata;
	private JLabel label_QuestionIndex;
	private JTextArea textArea_question_text;
	private JScrollPane scrollPane_questionScroll;
	private JPanel panel_MultiData;
	private JScrollPane scrollPane_MultiData;
	private JRadioButton rdbtn_radio_type;
	private JPanel cardLayPanel_answers;
	private JButton btn_ansradio_addans;
	private JButton btn_ansradio_remans;
	private JButton btn_anscheck_addans;
	private JButton btn_anscheck_rembut;

	/**
	 * Create the panel.
	 */
	public QuestionPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0};
		panel.setLayout(gbl_panel);
		
		scrollPane_questionScroll = new JScrollPane();
		GridBagConstraints gbc_scrollPane_questionScroll = new GridBagConstraints();
		gbc_scrollPane_questionScroll.gridwidth = 19;
		gbc_scrollPane_questionScroll.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_questionScroll.gridx = 1;
		gbc_scrollPane_questionScroll.gridy = 0;
		panel.add(scrollPane_questionScroll, gbc_scrollPane_questionScroll);
		
		textArea_question_text = new JTextArea();
		textArea_question_text.setRows(6);
		textArea_question_text.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_question_text.setColumns(78);
		scrollPane_questionScroll.setViewportView(textArea_question_text);
		
		btn_Add_multidata = new JButton("Add multidata");
		GridBagConstraints gbc_btn_Add_multidata = new GridBagConstraints();
		gbc_btn_Add_multidata.insets = new Insets(0, 0, 5, 0);
		gbc_btn_Add_multidata.gridx = 20;
		gbc_btn_Add_multidata.gridy = 0;
		panel.add(btn_Add_multidata, gbc_btn_Add_multidata);
		
		label_QuestionIndex = new JLabel(":");
		GridBagConstraints gbc_label_QuestionIndex = new GridBagConstraints();
		gbc_label_QuestionIndex.anchor = GridBagConstraints.EAST;
		gbc_label_QuestionIndex.gridx = 0;
		gbc_label_QuestionIndex.gridy = 0;
		panel.add(label_QuestionIndex, gbc_label_QuestionIndex);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_MultiData = new JPanel();
		panel_1.add(panel_MultiData, BorderLayout.NORTH);
		panel_MultiData.setLayout(new BorderLayout(0, 0));
		
		scrollPane_MultiData = new JScrollPane();
		panel_MultiData.add(scrollPane_MultiData);
		
		JPanel panel_Answer = new JPanel();
		panel_1.add(panel_Answer, BorderLayout.CENTER);
		panel_Answer.setLayout(new BoxLayout(panel_Answer, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_Answer.add(panel_2);
		
		rdbtn_field_type = new JRadioButton("Field");
		panel_2.add(rdbtn_field_type);
		
		rdbtn_radio_type = new JRadioButton("Radio");
		panel_2.add(rdbtn_radio_type);
		
		JRadioButton rdbtn_check_type = new JRadioButton("Check");
		panel_2.add(rdbtn_check_type);
		
		cardLayPanel_answers = new JPanel();
		panel_Answer.add(cardLayPanel_answers);
		cardLayPanel_answers.setLayout(new CardLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		cardLayPanel_answers.add(panel_4, "name_7631977005237");
		
		textField_answer = new JTextField();
		panel_4.add(textField_answer);
		textField_answer.setColumns(10);
		
		JPanel panel_ansradio = new JPanel();
		cardLayPanel_answers.add(panel_ansradio, "name_7635834770771");
		panel_ansradio.setLayout(new BoxLayout(panel_ansradio, BoxLayout.Y_AXIS));
		
		JPanel panel_ansradio_acts = new JPanel();
		panel_ansradio.add(panel_ansradio_acts);
		panel_ansradio_acts.setLayout(new BoxLayout(panel_ansradio_acts, BoxLayout.X_AXIS));
		
		btn_ansradio_addans = new JButton("Add");
		panel_ansradio_acts.add(btn_ansradio_addans);
		
		btn_ansradio_remans = new JButton("Rem");
		panel_ansradio_acts.add(btn_ansradio_remans);
		
		JPanel panel_ansradio_answers = new JPanel();
		panel_ansradio.add(panel_ansradio_answers);
		
		JPanel panel_anscheck = new JPanel();
		cardLayPanel_answers.add(panel_anscheck, "name_7637778863780");
		panel_anscheck.setLayout(new BoxLayout(panel_anscheck, BoxLayout.Y_AXIS));
		
		JPanel panel_anscheck_acts = new JPanel();
		panel_anscheck.add(panel_anscheck_acts);
		panel_anscheck_acts.setLayout(new BoxLayout(panel_anscheck_acts, BoxLayout.X_AXIS));
		
		btn_anscheck_addans = new JButton("Add");
		panel_anscheck_acts.add(btn_anscheck_addans);
		
		btn_anscheck_rembut = new JButton("Rem");
		panel_anscheck_acts.add(btn_anscheck_rembut);
		
		JPanel panel_anscheck_answers = new JPanel();
		panel_anscheck.add(panel_anscheck_answers);

	}

}
