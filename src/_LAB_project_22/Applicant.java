package _LAB_project_22;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import java.awt.List;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.nio.channels.ShutdownChannelGroupException;
import java.beans.PropertyChangeEvent;
import java.awt.Panel;

public class Applicant extends JFrame {

	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;

	public JRadioButtonMenuItem rdbtnmntmMale;
	public JRadioButtonMenuItem rdbtnmntmFemale;
	public JComboBox comboBox;

	public String showhgjh() {
		String now ="Name: "+ textField.getText() + "\n";
		now = now + "Address:  " + textField_1.getText() + "\n";
		now = now + "Passport No. " + textField_2.getText() + "\n";
		now = now + "Email: " + textField_3.getText() + "\n";
		now = now + "Amount: " + textField_4.getText() + "\n";

		if (rdbtnmntmFemale.isSelected()) {
			now = now + " Gender: female" + "\n";
		}

		if (rdbtnmntmMale.isSelected()) {
			now = now + "Gender: male " + "\n";
		}
		
		String[] strings = { "Student", "Tourist", "Treatment" };
		now = now + "Type of Visa:   " + strings[comboBox.getSelectedIndex()] + "\n"+"\nHave a safe Journey.\n";
		
		
		return now;
	}

	public Applicant() {
		setResizable(false);
		setTitle("Applicant Application Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 605);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(10, 0, 503, 68);
		contentPane.add(panel_1);

		JLabel lblApplicationForm = new JLabel("Application Form");
		lblApplicationForm.setFont(new Font("Dialog", Font.BOLD, 16));
		panel_1.add(lblApplicationForm);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField.setBounds(264, 113, 161, 39);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_1.setBounds(264, 166, 161, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_2.setBounds(264, 227, 161, 39);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(47, 113, 126, 27);
		contentPane.add(lblNewLabel);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblAddress.setBackground(Color.DARK_GRAY);
		lblAddress.setBounds(47, 172, 126, 27);
		contentPane.add(lblAddress);

		JLabel lblPassportNo = new JLabel("Passport No.");
		lblPassportNo.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblPassportNo.setBackground(Color.DARK_GRAY);
		lblPassportNo.setBounds(47, 227, 126, 27);
		contentPane.add(lblPassportNo);

		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblEmail.setBackground(Color.DARK_GRAY);
		lblEmail.setBounds(47, 285, 126, 27);
		contentPane.add(lblEmail);

		JLabel lblTypeOfVisa = new JLabel("Type of Visa. ");
		lblTypeOfVisa.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblTypeOfVisa.setBackground(Color.DARK_GRAY);
		lblTypeOfVisa.setBounds(47, 409, 126, 27);
		contentPane.add(lblTypeOfVisa);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(264, 277, 161, 39);
		contentPane.add(textField_3);

		rdbtnmntmMale = new JRadioButtonMenuItem("Male");
		rdbtnmntmMale.setBackground(new Color(240, 230, 140));
		rdbtnmntmMale.setFont(new Font("Verdana", Font.PLAIN, 15));
		rdbtnmntmMale.setBounds(48, 338, 108, 39);
		contentPane.add(rdbtnmntmMale);

		rdbtnmntmFemale = new JRadioButtonMenuItem("Female");
		rdbtnmntmFemale.setBackground(new Color(240, 230, 140));
		rdbtnmntmFemale.setFont(new Font("Verdana", Font.PLAIN, 15));
		rdbtnmntmFemale.setBounds(189, 338, 108, 39);
		contentPane.add(rdbtnmntmFemale);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("SolaimanLipi", Font.PLAIN, 13));
		comboBox.setBackground(new Color(250, 235, 215));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Student", "Tourist", "Treatment" }));
		comboBox.setBounds(235, 416, 75, 20);
		contentPane.add(comboBox);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String fee = textField_4.getText();
				int processing_fee = Integer.parseInt(fee);
				String pass = textField_2.getText();

				if (processing_fee < 500 || pass.length() != 6) {
					JOptionPane.showMessageDialog(null, "Invalid Passport No.\nEnter correct amount of Fee.");
					textField_2.setText("");
					textField_4.setText("");

				} else {
					JOptionPane.showMessageDialog(null, "Success !!\nSent to Approver ");
					Visa_processing_system.approver.setVisible(true);
					Visa_processing_system.applicant.setVisible(false);
				}

			}
		});
		btnSubmit.setBackground(new Color(154, 205, 50));
		btnSubmit.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 13));
		btnSubmit.setBounds(221, 528, 89, 23);
		contentPane.add(btnSubmit);

		JLabel lblProcessingFee = new JLabel("Processing Fee:");
		lblProcessingFee.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblProcessingFee.setBackground(Color.DARK_GRAY);
		lblProcessingFee.setBounds(48, 470, 163, 27);
		contentPane.add(lblProcessingFee);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(264, 470, 161, 39);
		contentPane.add(textField_4);

		Panel panel = new Panel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 74, 522, 5);
		contentPane.add(panel);
	}
}
