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
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Panel;

public class Admin extends JFrame {

	public JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Admin() {
		setResizable(false);
		setTitle("Applicant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 453);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCheakingAllThe = new JLabel("Cheaking all the informations.....");
		lblCheakingAllThe.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblCheakingAllThe.setBackground(Color.DARK_GRAY);
		lblCheakingAllThe.setBounds(44, 94, 282, 37);
		contentPane.add(lblCheakingAllThe);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"E:\\Documents\\_LAB_project_22\\jQuery-Ajax-Loading-Overlay-with-Loading-Text-Spinner-Plugin.jpg"));
		lblNewLabel.setBounds(21, 130, 363, 143);
		contentPane.add(lblNewLabel);

		JLabel lblPleaseWait = new JLabel("Please Wait...");
		lblPleaseWait.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblPleaseWait.setBackground(Color.DARK_GRAY);
		lblPleaseWait.setBounds(169, 284, 282, 37);
		contentPane.add(lblPleaseWait);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(10, 0, 441, 68);
		contentPane.add(panel);

		JLabel lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(lblAdminPanel);

		JButton btnClickHere = new JButton("Click here");
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					
					System.out.println(Visa_processing_system.applicant.showhgjh());
					JOptionPane.showMessageDialog(null, Visa_processing_system.applicant.showhgjh());

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("problem occurs gobinda1 1 1 1 11 ");
					e.printStackTrace();
					System.out.println("problem s occurs gobinda   2 2 2 2 2 ");
				}

			}
		});
		btnClickHere.setBounds(271, 350, 89, 23);
		contentPane.add(btnClickHere);

		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 83, 469, 5);
		contentPane.add(panel_1);
	}
}
