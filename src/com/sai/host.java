package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class host {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void hScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					host window = new host();
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
	public host() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRubiRestaurant = new JLabel("Rubi Restaurant");
		lblRubiRestaurant.setFont(new Font("Algerian", Font.PLAIN, 55));
		lblRubiRestaurant.setBounds(176, 23, 583, 73);
		frame.getContentPane().add(lblRubiRestaurant);
		
		JButton btnNewButton = new JButton("Allot Table for Customer");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReserveTable rt=new ReserveTable();
				rt.RTScreen();
			}
		});
		btnNewButton.setBounds(203, 169, 447, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reserved Table Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelTRCDetails s=new SelTRCDetails();
				s.sScreen();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(203, 270, 447, 44);
		frame.getContentPane().add(btnNewButton_1);
	}

}
