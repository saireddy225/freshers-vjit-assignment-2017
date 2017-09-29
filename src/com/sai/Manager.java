package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void M() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager window = new Manager();
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
	public Manager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("RUBI RESTAURANT");
		label.setBounds(208, 11, 1352, 86);
		label.setForeground(Color.RED);
		label.setFont(new Font("Algerian", Font.PLAIN, 64));
		label.setBackground(new Color(152, 251, 152));
		frame.getContentPane().add(label);
		
		JButton btnTablesReserved = new JButton("Take Order");
		btnTablesReserved.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mngOrder m=new mngOrder();
				m.moScreen();
			}
		});
		btnTablesReserved.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnTablesReserved.setBounds(407, 141, 305, 58);
		frame.getContentPane().add(btnTablesReserved);
	}
}
