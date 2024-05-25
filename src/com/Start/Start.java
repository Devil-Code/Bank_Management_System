package com.Start;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Start extends JFrame {

	private JPanel contentPane;
	private final JSeparator separator = new JSeparator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//System.exit(0);
				Main_Menu x= new Main_Menu();
				Main_Menu.main(null);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setBounds(46, 205, 96, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Login to your Account By pressing Login button ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(10, 56, 414, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("If you want to create a new account press ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(10, 99, 404, 40);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("the Sign in Button");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(10, 131, 374, 27);
		contentPane.add(lblNewLabel_3);
		separator.setBounds(0, 48, 434, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.desktop);
		separator_1.setBounds(10, 189, 414, 2);
		contentPane.add(separator_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Table.darkShadow"));
		panel.setForeground(SystemColor.windowText);
		panel.setBounds(0, 0, 434, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Welcome To VRAP Bank");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 26));
	}

}
