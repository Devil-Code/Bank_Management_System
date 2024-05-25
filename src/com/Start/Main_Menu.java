package com.Start;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import com.Employee.login_emp;
import com.User.login;

import java.awt.Component;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class Main_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu frame = new Main_Menu();
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
	public Main_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(0, 0, 482, 44);
		contentPane.add(panel);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		panel.add(lblMainMenu);
		lblMainMenu.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("D:\\Aseem\\java\\optionPage\\src\\icon\\Start-Menu-Computer-icon (2).png"));
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblMainMenu}));
		
		
		
		JButton btnNewButton_1 = new JButton("Employee");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//System.exit(0);
				login_emp x= new login_emp();
				login_emp.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(148, 130, 163, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("User");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//System.exit(0);
				login x= new login();
				login.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_2.setBounds(148, 202, 163, 49);
		contentPane.add(btnNewButton_2);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblMainMenu, panel}));
	}
}
