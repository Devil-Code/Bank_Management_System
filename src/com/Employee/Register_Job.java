package com.Employee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register_Job extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register_Job frame = new Register_Job();
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
	public Register_Job() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJobStatus = new JLabel("Job Status");
		lblJobStatus.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblJobStatus.setBounds(23, 26, 170, 34);
		contentPane.add(lblJobStatus);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 58, 390, 2);
		contentPane.add(separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","Working","Self Employed","Unemployed"}));
		comboBox.setName("");
		comboBox.setToolTipText("");
		comboBox.setBounds(122, 83, 170, 28);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("As On ");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(38, 154, 63, 28);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setName("");
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(90, 160, 69, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_2.setBounds(176, 160, 83, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Year","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"}));
		comboBox_3.setBounds(275, 160, 69, 20);
		contentPane.add(comboBox_3);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem()=="Working")
				{
					Register_Employed em =new Register_Employed();
					Register_Employed.main(null);
				}
				else if(comboBox.getSelectedItem()=="Self Employed")
				{
					Register_SelfEmployed se =new Register_SelfEmployed();
					Register_SelfEmployed.main(null);
				}
				else if(comboBox.getSelectedItem()=="Unemployed")
				{
					Regiter_UnEmployed ue =new Regiter_UnEmployed();
					Regiter_UnEmployed.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Employment Status Not Selected","Job Status",JOptionPane.ERROR_MESSAGE);
				}
			
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.setBounds(236, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 199, 388, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register_Personal a=new Register_Personal();
				Register_Personal.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_1.setBounds(88, 215, 83, 23);
		contentPane.add(btnNewButton_1);
	}
}
