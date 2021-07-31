package _LAB_project_22;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class Approver extends JFrame {

	public JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Approver() {
		setResizable(false);
		setTitle("Approver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Click here");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "There are some problems in your application form.\nPlease fill up again.");
				
				Visa_processing_system.applicant.setVisible(true);
				
				Visa_processing_system.approver.setVisible(false);
			}
		});
		btnNewButton.setBounds(65, 210, 102, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClickHere = new JButton("Click here");
		btnClickHere.setBackground(Color.GREEN);
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Success !!\nHas been send to admin for final approval.");
				Visa_processing_system.admin.setVisible(true);
			}
		});
		btnClickHere.setBounds(260, 210, 102, 23);
		contentPane.add(btnClickHere);
		
		JLabel lblSendToAdmin = new JLabel("Send to \r\nAdmin");
		lblSendToAdmin.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		lblSendToAdmin.setBounds(260, 156, 139, 43);
		contentPane.add(lblSendToAdmin);
		
		JLabel lblSendBackTo = new JLabel("Send back to User");
		lblSendBackTo.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		lblSendBackTo.setBounds(65, 156, 139, 43);
		contentPane.add(lblSendBackTo);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(0, 0, 433, 68);
		contentPane.add(panel);
		
		JLabel lblApproverPanel = new JLabel("Approver Panel");
		lblApproverPanel.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(lblApproverPanel);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 74, 443, 5);
		contentPane.add(panel_1);
	}

}
