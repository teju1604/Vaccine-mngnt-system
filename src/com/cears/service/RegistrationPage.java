package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(208, 146, 127, 22);
		contentPane.add(textArea);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setForeground(Color.BLACK);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.CYAN);
		contentPane_1.setBounds(-32, -137, 584, 661);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(129, 29, 455, 48);
		contentPane_1.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(10, 11, 506, 90);
		contentPane_1.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(38, 146, 506, 90);
		contentPane_1.add(panel);
		panel.setBackground(Color.RED);
		
		JLabel lblNewLabel = new JLabel("Registration Page");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(240, 366, 127, 22);
		contentPane_1.add(textArea_1_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(240, 323, 127, 22);
		contentPane_1.add(textArea_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setBounds(240, 409, 127, 22);
		contentPane_1.add(textArea_1_1_1);
		
		JTextArea textArea_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1.setBounds(240, 452, 127, 22);
		contentPane_1.add(textArea_1_1_1_1);
		
		JTextArea textArea_1_1_1_1_1 = new JTextArea();
		textArea_1_1_1_1_1.setBounds(240, 495, 127, 22);
		contentPane_1.add(textArea_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(150, 285, 81, 20);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Phone No:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(150, 409, 81, 20);
		contentPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" Last Name:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(150, 366, 81, 20);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Email Id:");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_2.setBounds(149, 452, 81, 20);
		contentPane_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("DOB:");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_2_1.setBounds(149, 500, 81, 20);
		contentPane_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel(" Middle Name:");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(129, 328, 102, 20);
		contentPane_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gender:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(162, 543, 62, 20);
		contentPane_1.add(lblNewLabel_2_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(235, 544, 54, 23);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(308, 544, 72, 23);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(171, 589, 60, 14);
		contentPane_1.add(lblNewLabel_3);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(235, 584, 120, 75);
		contentPane_1.add(textArea_2);
		setUndecorated(true);
	}
}
