package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class operations {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void opScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operations window = new operations();
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
	public operations() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(0, 0, 1368,689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("RUBI RESTAURANT");
		label.setBounds(209, 37, 1352, 86);
		label.setForeground(Color.RED);
		label.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 64));
		label.setBackground(new Color(152, 251, 152));
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Order Food");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RubiRestaurants rr=new RubiRestaurants();
				rr.RR();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(619, 134, 360, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReserveFood = new JButton("Reserve Table");
		btnReserveFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		ReserveTable tr=new 	ReserveTable();
				tr.RTScreen();
				
			}
		});
		btnReserveFood.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReserveFood.setBounds(619, 239, 360, 46);
		frame.getContentPane().add(btnReserveFood);
		
		JButton btnFoodOrdered = new JButton("Food Ordered");
		btnFoodOrdered.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				foDetails fod= new foDetails();
				fod.foScreen();
				
			}
		});
		btnFoodOrdered.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnFoodOrdered.setBounds(619, 357, 360, 46);
		frame.getContentPane().add(btnFoodOrdered);
		
		JButton btnReervedTableDetails = new JButton("Reserved Table Details");
		btnReervedTableDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelTRCDetails std=new SelTRCDetails();
				std.sScreen();
				
				
			}
		});
		btnReervedTableDetails.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnReervedTableDetails.setBounds(619, 479, 360, 46);
		frame.getContentPane().add(btnReervedTableDetails);
	}
}
