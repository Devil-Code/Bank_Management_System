package com.Employee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Regiter_UnEmployed extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regiter_UnEmployed frame = new Regiter_UnEmployed();
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
	public Regiter_UnEmployed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 347);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("       Info");
		lblNewLabel.setForeground(UIManager.getColor("TabbedPane.highlight"));
		lblNewLabel.setBackground(UIManager.getColor("Table.darkShadow"));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
		lblNewLabel.setBounds(-32, 0, 550, 79);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.desktop);
		separator.setBounds(10, 68, 498, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Education Status");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(94, 117, 142, 26);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Currently a Student", "Educated", "Uneducated"}));
		comboBox.setBounds(246, 122, 160, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Pan Card No.");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(94, 167, 142, 26);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(246, 172, 160, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.desktop);
		separator_1.setBounds(10, 240, 498, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register_Job b=new Register_Job();
				Register_Personal.main(null);
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnNewButton.setBounds(31, 263, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				comboBox.setSelectedIndex(0);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton_1.setBounds(211, 263, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnNewButton_2.setBounds(394, 263, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HOME\\Desktop\\Document-write-icon (1).png"));
		lblNewLabel_3.setBounds(62, 11, 46, 46);
		contentPane.add(lblNewLabel_3);
	}
}
