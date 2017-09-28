package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelTRCDetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void sScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelTRCDetails window = new SelTRCDetails();
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
	public SelTRCDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 0, 102));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Break Fast", "Lunch", "Dinner"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBox.setBounds(326, 275, 224, 48);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSelectCategory = new JLabel("Select Category");
		lblSelectCategory.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblSelectCategory.setBounds(326, 222, 258, 42);
		frame.getContentPane().add(lblSelectCategory);
		
		JLabel lblNewLabel = new JLabel("Rubi Restaurant");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 55));
		lblNewLabel.setBounds(235, 96, 490, 84);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((comboBox.getSelectedItem().equals("Break Fast"))) {
					BFResTables bf=new BFResTables();
					bf.bfScreen();
				}
				if ((comboBox.getSelectedItem().equals("Lunch"))) {
					LResTables l=new LResTables();
					l.lScreen1();
				}
				if ((comboBox.getSelectedItem().equals("Dinner"))) {
					DReTables d=new DReTables();
					d.dScreen();
				}
				
				
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnSubmit.setBounds(326, 384, 206, 48);
		frame.getContentPane().add(btnSubmit);
	}
}
