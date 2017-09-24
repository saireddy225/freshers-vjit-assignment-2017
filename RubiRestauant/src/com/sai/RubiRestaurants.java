package com.sai;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Font;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.CardLayout;

public class RubiRestaurants {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		
		JLabel lblRubiRetaurant = new JLabel("Rubi Retaurant");
		lblRubiRetaurant.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblRubiRetaurant.setBounds(267, 68, 216, -45);
		frame.getContentPane().add(lblRubiRetaurant);
		
		JLabel lblRubiRetaurant_1 = new JLabel("Rubi Restaurant");
		lblRubiRetaurant_1.setForeground(Color.RED);
		lblRubiRetaurant_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblRubiRetaurant_1.setBounds(423, 23, 361, 49);
		frame.getContentPane().add(lblRubiRetaurant_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(557, 124, 361, 271);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnVeg = new JButton("VEG");
		btnVeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VegMenu vm=new VegMenu();
				vm.NewScreen();
			}
			
		});
		btnVeg.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnVeg.setBackground(Color.GREEN);
		btnVeg.setBounds(91, 36, 172, 75);
		panel_1.add(btnVeg);
		
		JButton btnNewButton_1 = new JButton("NON VEG");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(91, 156, 172, 82);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("MENU");
		btnNewButton.setBounds(243, 254, 185, 49);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 33));
		
		
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
