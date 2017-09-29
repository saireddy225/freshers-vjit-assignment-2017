package com.sai;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class RubiRestaurants {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void RR() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RubiRestaurants window = new RubiRestaurants();
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
	public RubiRestaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblRubiRetaurant = new JLabel("Rubi Retaurant");
		lblRubiRetaurant.setBounds(267, 68, 216, -45);
		lblRubiRetaurant.setFont(new Font("Tahoma", Font.BOLD, 50));
		frame.getContentPane().add(lblRubiRetaurant);
		
		JLabel lblRubiRetaurant_1 = new JLabel("Rubi Restaurant");
		lblRubiRetaurant_1.setBounds(557, 30, 497, 49);
		lblRubiRetaurant_1.setForeground(Color.RED);
		lblRubiRetaurant_1.setFont(new Font("Algerian", Font.PLAIN, 50));
		frame.getContentPane().add(lblRubiRetaurant_1);
		
		JLabel lblMenu = new JLabel("CLICK BELOW BUTTON TO GET MENU");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMenu.setBounds(580, 157, 532, 57);
		frame.getContentPane().add(lblMenu);
		
		JButton btnNewButton = new JButton("CLICK HERE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VegMenu m=new VegMenu();
				m.NewScreen();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.setBounds(703, 261, 249, 41);
		frame.getContentPane().add(btnNewButton);
		
		
		Border emptyBorder1 = BorderFactory.createEmptyBorder();
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
