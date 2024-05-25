package com.Employee;
//import Face_C;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Register_Employed extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_Employed frame = new Register_Employed();
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
	public Register_Employed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 479);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Job Info");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(34, 42, 174, 32);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.desktop);
		separator.setBounds(23, 85, 672, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Name Of the Company");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(34, 121, 174, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setBounds(221, 125, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(34, 186, 104, 20);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 186, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Employment Program");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(416, 184, 174, 24);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","1 Year","3 Years","5 Years And Above","Permanent"}));
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setBounds(567, 188, 128, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Annual Income");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(416, 251, 142, 24);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"","Below 50000","Above 50000","Between 1Lakh and 6Lakhs","Above 6Lakhs","Above 10Lakhs"}));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBounds(553, 255, 142, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Office Phone No.");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(416, 121, 115, 24);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(567, 126, 128, 18);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.desktop);
		separator_1.setBounds(23, 336, 672, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.setBounds(70, 377, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_1.setBounds(316, 377, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cName=textField.getText();
				String address=textField_1.getText();
				String Phno=textField_2.getText();
				String pan=textField_3.getText();
				Validity v=new Validity();
				if(v.validalpha(cName)==true&&v.validphno(Phno)==true)
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
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_2.setBounds(575, 377, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Pan Card No.");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(34, 258, 104, 24);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 255, 128, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\HOME\\Desktop\\Document-write-icon (1).png"));
		lblNewLabel_7.setBounds(116, 28, 54, 59);
		contentPane.add(lblNewLabel_7);
	}
}
