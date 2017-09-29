package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class TableConfirmed {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void tcScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableConfirmed window = new TableConfirmed();
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
	public TableConfirmed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rubi Restaurant");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 55));
		lblNewLabel.setBounds(581, 21, 1352, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Thank you for Reserving Table");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblNewLabel_1.setBounds(517, 151, 646, 85);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
