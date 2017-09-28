package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		frame.getContentPane().setBackground(new Color(0, 250, 154));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("RUBI RESTAURANT");
		lblNewLabel.setBounds(155, 11, 1187, 96);
		lblNewLabel.setBackground(new Color(152, 251, 152));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 64));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    Nothing \r\nBrings People\r\n together\r\n Like  \r\ngood\r\n food");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(261, 118, 615, 96);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnFoodMenu = new JButton("FOOD MENU");
		btnFoodMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mmenu mm=new mmenu();
				mm.mScreen();
			}
		});
		btnFoodMenu.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnFoodMenu.setBounds(377, 245, 241, 34);
		frame.getContentPane().add(btnFoodMenu);
		
		JButton btnContact = new JButton("CONTACT");
		btnContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "phone:9652514215 Email:rubiconco@gmail.com");
			
			}
		});
		btnContact.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnContact.setBounds(377, 341, 241, 34);
		frame.getContentPane().add(btnContact);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegitration cr = new CustomerRegitration();
				cr.CR();
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnSignUp.setBounds(377, 452, 241, 34);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LoginTwo rr=new LoginTwo();
				rr.lt();
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnLogin.setBounds(377, 559, 241, 34);
		frame.getContentPane().add(btnLogin);
	}

}
