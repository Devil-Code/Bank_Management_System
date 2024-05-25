package com.Employee;
import Services.BankServices_c;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Services.BankServices_c;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Register_SelfEmployed extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_SelfEmployed frame = new Register_SelfEmployed();
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
	public Register_SelfEmployed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 464);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Business Info");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel.setBounds(26, 63, 230, 35);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 109, 669, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Name Of The Company");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(26, 153, 169, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(212, 155, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(26, 231, 96, 17);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 228, 136, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Pan Card No.");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(26, 305, 147, 17);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 302, 136, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Annual Income");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(392, 158, 121, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Business Category");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(392, 231, 121, 23);
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 338, 669, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register_Job x =new Register_Job();
				Register_Job.main(null);
			}
		});
		btnNewButton.setBounds(57, 374, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_1.setBounds(289, 374, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","I.T","Machinery","House Hold","Organic","Others"}));
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setBounds(523, 239, 121, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"","Below 50000","Above 50000","B/W 1Lakh and 6Lakhs","Above 6Lakhs","Above 10Lakhs"}));
		comboBox_1.setBounds(523, 160, 121, 20);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cName=textField.getText();
				Validity v=new Validity();
				if(v.validalpha(cName)==true)
				{
					Employee_Menu o=new Employee_Menu();
					Employee_Menu.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Input", "X", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnNewButton_2.setBounds(520, 374, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\HOME\\Desktop\\Document-write-icon (1).png"));
		lblNewLabel_6.setBounds(162, 55, 54, 43);
		contentPane.add(lblNewLabel_6);
	}

}
