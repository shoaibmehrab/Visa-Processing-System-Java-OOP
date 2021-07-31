package _LAB_project_22;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sign_in extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public Sign_in() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsrename = new JLabel("Usrename:");
		lblUsrename.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsrename.setBounds(56, 160, 114, 46);
		contentPane.add(lblUsrename);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(228, 169, 119, 35);
		contentPane.add(textField);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(56, 216, 114, 46);
		contentPane.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(228, 227, 119, 30);
		contentPane.add(passwordField);

		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = new String(passwordField.getPassword());
				if ((username.equals("arif")&&password.equals("arif")) || (username.equals("pinky")&&password.equals("pinky")) ||(username.equals("fahad")&&password.equals("fahad")))  {
					Visa_processing_system.applicant.setVisible(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Incorrect Username and password");
					textField.setText("");
					passwordField.setText("");
				}

			}
		});
		btnLogIn.setBackground(new Color(154, 205, 50));
		btnLogIn.setBounds(235, 289, 89, 23);
		contentPane.add(btnLogIn);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(10, 0, 393, 68);
		contentPane.add(panel);

		JLabel lblSignInWith = new JLabel("Sign in with your Account");
		lblSignInWith.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(lblSignInWith);

		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 76, 435, 3);
		contentPane.add(panel_1);
	}

}
