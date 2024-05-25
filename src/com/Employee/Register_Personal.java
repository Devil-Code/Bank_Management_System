package com.Employee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Start.Start;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

import Services.BankServices_c;
import javax.swing.JComboBox;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
public class Register_Personal extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textName2;
	private JTextField textAddrs;
	private JTextField textMno;
	private JTextField textEid;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_Personal frame = new Register_Personal();
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
	public Register_Personal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 432);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.activeCaptionBorder);
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblName.setBounds(22, 103, 72, 20);
		contentPane.add(lblName);
		
		JLabel lblName2 = new JLabel("Father Name");
		lblName2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblName2.setBounds(22, 167, 113, 23);
		contentPane.add(lblName2);
		
		JLabel lblDOB = new JLabel("DOB");
		lblDOB.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblDOB.setBounds(22, 226, 72, 14);
		contentPane.add(lblDOB);
		
		JLabel lblAddrs = new JLabel("Address");
		lblAddrs.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblAddrs.setBounds(390, 226, 72, 14);
		contentPane.add(lblAddrs);
		
		JLabel lblMno = new JLabel("Mobile No.");
		lblMno.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblMno.setBounds(384, 103, 78, 20);
		contentPane.add(lblMno);
		
		JLabel lblEid = new JLabel("Email Id");
		lblEid.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblEid.setBounds(390, 171, 78, 14);
		contentPane.add(lblEid);
		
		textName = new JTextField();
		textName.setBounds(133, 105, 199, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textName2 = new JTextField();
		textName2.setBounds(133, 170, 199, 20);
		contentPane.add(textName2);
		textName2.setColumns(10);
		
		textAddrs = new JTextField();
		textAddrs.setBounds(474, 226, 239, 19);
		contentPane.add(textAddrs);
		textAddrs.setColumns(10);
		
		textMno = new JTextField();
		textMno.setBounds(478, 105, 204, 20);
		contentPane.add(textMno);
		textMno.setColumns(10);
		
		textEid = new JTextField();
		textEid.setBounds(478, 165, 204, 20);
		contentPane.add(textEid);
		textEid.setColumns(10);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Employee_Menu o= new Employee_Menu();
				Employee_Menu.main(null);
				
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.setBounds(88, 342, 89, 23);
		contentPane.add(btnNewButton);
		
		

		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setBounds(133, 225, 61, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_1.setBounds(204, 225, 81, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Year", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999"}));
		comboBox_2.setBounds(293, 225, 66, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Male", "Female", "Transgender"}));
		comboBox_3.setBounds(474, 274, 152, 20);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textName.setText(null);
				textName2.setText(null);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);				
				textAddrs.setText(null);
				textMno.setText(null);
				textEid.setText(null);
			
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_1.setBounds(306, 342, 89, 23);
		contentPane.add(btnNewButton_1);		
		
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.desktop);
		separator.setBounds(22, 315, 660, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Aadhar No.");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(22, 271, 113, 20);
		contentPane.add(lblNewLabel_1);
		
		
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 46, 14);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Table.darkShadow"));
		panel.setBounds(-359, 0, 1082, 58);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Customer Registration");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(133, 273, 199, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(390, 277, 72, 20);
		contentPane.add(lblNewLabel_2);
		
		
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String name=textName.getText();
				    String fname=textName2.getText();
				   // String mname=textField_2.getText();
				   // String dob=textDOB.getText();
				    int date = comboBox.getSelectedIndex();
					int month = comboBox_1.getSelectedIndex();
					int year = comboBox_2.getSelectedIndex();
					String adhar=textField.getText();
					int gen= comboBox_3.getSelectedIndex();
				    String email=textEid.getText();
				    String address=textAddrs.getText();
				    String mob=textMno.getText();
				    int amount= 0;
					int aNumber = 0; 
					aNumber = (int)((Math.random() * 9000)+1000);
					//JOptionPane.showMessageDialog(null,"Account number is :"+aNumber );
					Validity v=new Validity();
					if(v.validalpha(fname)==true&&v.validalpha(name)==true&&v.validEmail(email)==true&&v.validphno(mob)==true&&v.validadhar(adhar)==true)
					{
						Register_Job f=new Register_Job();
						Register_Job.main(null);
						
						BankServices_c bs=new BankServices_c();
						
						//Customer1 op=new Customer1();
						//op.setVisible(true);
						//dispose();
						int mobilenum=Integer.parseInt(textMno.getText());
						bs.savingAcc(name, fname,date, month, year, address,adhar,gen,mobilenum, email, amount, aNumber);
					}
					else
					{
										JOptionPane.showMessageDialog(null,"Invalid Input", "X", JOptionPane.ERROR_MESSAGE);
					}
					
					
				}
				catch(Exception e)
				{
					e.toString();
				}
				/*Face_2 n=new Face_2();
				Face_2.main(null);*/
			}
				
			
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnNewButton_2.setBounds(519, 342, 89, 23);
		contentPane.add(btnNewButton_2);
		
	}
}
