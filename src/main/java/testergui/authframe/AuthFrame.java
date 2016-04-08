package testergui.authframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;

public class AuthFrame extends JFrame {
	JPanel userDataPanel;
	JPanel authOperationsPanel;
	JPanel actionsPanel;
	JPanel loginPanel;
	JTextField login_JTextField;
	JButton Register_JButton;
	JButton LogIn_JButton;
	JPanel authPanel;
	JLabel login_JLabel;
	JLabel password_JLabel;
	JPanel panel;
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;
	JPasswordField password_JPasswordField;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HostesFramebyBuilder frame = new HostesFramebyBuilder();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AuthFrame() {
		setTitle("Authorization");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//close in linker!
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		authPanel = new JPanel();
		contentPane.add(authPanel);
		authPanel.setLayout(new BoxLayout(authPanel, BoxLayout.X_AXIS));
		
		userDataPanel = new JPanel();
		authPanel.add(userDataPanel);
		userDataPanel.setLayout(new BoxLayout(userDataPanel, BoxLayout.X_AXIS));
		
		loginPanel = new JPanel();
		userDataPanel.add(loginPanel);
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
		
		panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		loginPanel.add(panel);
		
		login_JLabel = new JLabel("Login:");
		panel.add(login_JLabel);
		
		panel_1 = new JPanel();
		loginPanel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		password_JLabel = new JLabel("Password:");
		panel_1.add(password_JLabel);
		
		JPanel passwordPanel = new JPanel();
		userDataPanel.add(passwordPanel);
		passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.Y_AXIS));
		
		panel_2 = new JPanel();
		passwordPanel.add(panel_2);
		
		login_JTextField = new JTextField();
		panel_2.add(login_JTextField);
		login_JTextField.setColumns(15);
		
		panel_3 = new JPanel();
		passwordPanel.add(panel_3);
		
		password_JPasswordField = new JPasswordField();
		password_JPasswordField.setColumns(15);
		panel_3.add(password_JPasswordField);
		
		authOperationsPanel = new JPanel();
		authPanel.add(authOperationsPanel);
		authOperationsPanel.setLayout(new BoxLayout(authOperationsPanel, BoxLayout.X_AXIS));
		
		Register_JButton = new JButton("Register");
		authOperationsPanel.add(Register_JButton);
		
		actionsPanel = new JPanel();
		contentPane.add(actionsPanel);
		
		LogIn_JButton = new JButton("Log in");
		actionsPanel.add(LogIn_JButton);
		
		setLocationRelativeTo(null);						//Sets frame position in center of screen
	}

	public JButton getRegister_JButton() {
		return Register_JButton;
	}
	public JButton getLogIn_JButton() {
		return LogIn_JButton;
	}
	public JTextField getLogin_JTextField() {
		return login_JTextField;
	}
	public JPasswordField getPassword_JPasswordField() {
		return password_JPasswordField;
	}
}
