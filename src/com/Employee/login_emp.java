
	package com.Employee;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.SwingConstants;
	import java.awt.Color;
	import java.awt.SystemColor;
	import javax.swing.JTextPane;
	import java.awt.Font;
	import javax.swing.JPasswordField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JSeparator;
	import javax.swing.ImageIcon;
	import javax.swing.JPanel;
	import javax.swing.UIManager;

import com.Start.Start;

	public class login_emp {

		private JFrame frame;
		private JTextField txtUsername;
		private JPasswordField txtPassword;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						login_emp window = new login_emp();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public login_emp() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
			frame.getContentPane().setLayout(null);
			
			JButton btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String password =txtPassword.getText();
					String username= txtUsername.getText();
					
					if( username.equals("Admin") && password.equals("admin@123") )
					{
						txtPassword.setText(null);
						txtUsername.setText(null);
						Employee_Menu x= new Employee_Menu();
						Employee_Menu.main(null);
					}
					else if(username.equals("Emp") && password.equals("emp@123") )
					{
						txtPassword.setText(null);
						txtUsername.setText(null);
						Employee_Menu x= new Employee_Menu();
						Employee_Menu.main(null);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Invalid Username Or Password", "X", JOptionPane.ERROR_MESSAGE);
					}
					
					/*else if(Integer.parseInt(id)>0 && Integer.parseInt(id)<10000)
					{
						if ( password.equals(bankDAO.loginPage(userid,0)) )
						{
							
						}
							
					}
					else if(Integer.parseInt(id)>10000)
					{
						if ( password.equals(bankDAO.loginPage(userid,1)) )
						{
						}
							
					}*/
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(363, 307, 108, 33);
			frame.getContentPane().add(btnNewButton);
			
			JLabel lblUsername = new JLabel("Id");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblUsername.setBounds(32, 176, 148, 33);
			frame.getContentPane().add(lblUsername);
			
			JLabel lblCustomerLogin = new JLabel("Login");
			lblCustomerLogin.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblCustomerLogin.setBounds(20, 97, 216, 38);
			frame.getContentPane().add(lblCustomerLogin);
			
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblPassword.setBounds(32, 237, 101, 25);
			frame.getContentPane().add(lblPassword);
			
			txtUsername = new JTextField();
			txtUsername.setBackground(Color.WHITE);
			txtUsername.setBounds(190, 186, 166, 20);
			frame.getContentPane().add(txtUsername);
			txtUsername.setColumns(10);
			
			txtPassword = new JPasswordField();
			txtPassword.setBounds(190, 243, 166, 20);
			frame.getContentPane().add(txtPassword);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(20, 146, 451, 2);
			frame.getContentPane().add(separator);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(20, 284, 451, 2);
			frame.getContentPane().add(separator_1);
			
			JButton btnReset = new JButton("Reset");
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					
				}
			});
			btnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnReset.setBounds(190, 307, 114, 33);
			frame.getContentPane().add(btnReset);
			
			JButton btnExit = new JButton("Back");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//(yaha dispose nahi chal raha h)	dispose();
					//dispose();
					Start z= new Start();
					Start.main(null);
					
				}
			});
			btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnExit.setBounds(32, 307, 108, 33);
			frame.getContentPane().add(btnExit);
			
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.desktop);
			panel.setBounds(0, 0, 510, 89);
			frame.getContentPane().add(panel);
			
			JLabel lblBankManagementSystem = new JLabel("");
			panel.add(lblBankManagementSystem);
			lblBankManagementSystem.setIcon(new ImageIcon("C:\\Users\\HOME\\Desktop\\Capture_2.PNG"));
			lblBankManagementSystem.setBackground(SystemColor.menuText);
			lblBankManagementSystem.setForeground(SystemColor.text);
			lblBankManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 30));
			frame.setBounds(100, 100, 526, 410);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

