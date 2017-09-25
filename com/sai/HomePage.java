package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
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
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RUBI RESTAURANT");
		lblNewLabel.setBounds(155, 11, 1187, 96);
		lblNewLabel.setBackground(new Color(152, 251, 152));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 64));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Nothing\r\nBrings People\r\n together\r\n Like  \r\ngood\r\n food");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(261, 118, 615, 96);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnAbout.setBounds(395, 223, 241, 34);
		frame.getContentPane().add(btnAbout);
		
		JButton btnFoodMenu = new JButton("FOOD MENU");
		btnFoodMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFoodMenu.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnFoodMenu.setBounds(395, 291, 241, 34);
		frame.getContentPane().add(btnFoodMenu);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnHelp.setBounds(395, 370, 241, 34);
		frame.getContentPane().add(btnHelp);
		
		JButton btnContact = new JButton("CONTACT");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnContact.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnContact.setBounds(395, 437, 241, 34);
		frame.getContentPane().add(btnContact);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnSignUp.setBounds(395, 509, 241, 34);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LoginTwo rr=new LoginTwo();
				rr.lt();
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnLogin.setBounds(395, 582, 241, 34);
		frame.getContentPane().add(btnLogin);
	}

}
