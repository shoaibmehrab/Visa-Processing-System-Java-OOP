package _LAB_project_22;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Panel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visa_processing_system {

	public JFrame frmVisaProcessingSystem;
	public JTextField textField;
	public JTextField textField_1;
	public static JPasswordField passwordField;
	public static JTextField textField_2;

	public static Visa_processing_system window;

	public static Approver approver;
	public static Sign_in sign_in;

	public static Applicant applicant;
	public static Admin admin;

	public static void main(String[] args) {
		
		DBconnect connect=new DBconnect();
		connect.getdata();

		applicant = new Applicant();
		sign_in = new Sign_in();
		approver = new Approver();
		admin = new Admin();

		window = new Visa_processing_system();
		window.frmVisaProcessingSystem.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public Visa_processing_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVisaProcessingSystem = new JFrame();
		frmVisaProcessingSystem.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 14));
		frmVisaProcessingSystem.setResizable(false);
		frmVisaProcessingSystem.setTitle("Visa Processing System(Sign Up Page)");
		frmVisaProcessingSystem.getContentPane().setBackground(Color.WHITE);
		frmVisaProcessingSystem.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("Full Name:");
		lblName.setFont(new Font("Dialog", Font.BOLD, 17));
		lblName.setBounds(157, 159, 114, 46);
		frmVisaProcessingSystem.getContentPane().add(lblName);

		JLabel lblAdress = new JLabel("Address:");
		lblAdress.setFont(new Font("Dialog", Font.BOLD, 17));
		lblAdress.setBounds(157, 216, 114, 39);
		frmVisaProcessingSystem.getContentPane().add(lblAdress);

		JLabel lblSetNewPassword = new JLabel("Set New Password :");
		lblSetNewPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblSetNewPassword.setBounds(157, 306, 213, 34);
		frmVisaProcessingSystem.getContentPane().add(lblSetNewPassword);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField.setColumns(10);
		textField.setBounds(471, 159, 150, 36);
		frmVisaProcessingSystem.getContentPane().add(textField);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(471, 216, 150, 32);
		frmVisaProcessingSystem.getContentPane().add(textField_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(472, 316, 150, 24);
		frmVisaProcessingSystem.getContentPane().add(passwordField);

		JButton button = new JButton("Sign UP");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username = textField_2.getText();
				String pass = new String(passwordField.getPassword());
				JOptionPane.showConfirmDialog(null, "Account Created.\nWelcome to our Agency.");
				applicant.setVisible(true);
				window.frmVisaProcessingSystem.setVisible(false);
			}
		});
		button.setBackground(new Color(127, 255, 0));
		button.setBounds(489, 386, 89, 23);
		frmVisaProcessingSystem.getContentPane().add(button);

		Panel panel = new Panel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 74, 665, 5);
		frmVisaProcessingSystem.getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(10, 0, 645, 68);
		frmVisaProcessingSystem.getContentPane().add(panel_1);

		JLabel lblVisaProcessingSystem = new JLabel("Visa Processing System");
		lblVisaProcessingSystem.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_1.add(lblVisaProcessingSystem);

		JLabel lblCreateAccountHere = new JLabel("Create account here.          Or");
		lblCreateAccountHere.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCreateAccountHere.setBounds(111, 85, 288, 46);
		frmVisaProcessingSystem.getContentPane().add(lblCreateAccountHere);

		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_in.setVisible(true);
				window.frmVisaProcessingSystem.setVisible(false);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBounds(429, 100, 167, 23);
		frmVisaProcessingSystem.getContentPane().add(btnNewButton);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsername.setBounds(157, 266, 114, 39);
		frmVisaProcessingSystem.getContentPane().add(lblUsername);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(471, 266, 150, 32);
		frmVisaProcessingSystem.getContentPane().add(textField_2);
		frmVisaProcessingSystem.setBounds(100, 100, 671, 474);
		frmVisaProcessingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
