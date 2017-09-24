package com.sai;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderConfirmed {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderConfirmed window = new OrderConfirmed();
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
	public OrderConfirmed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 45, 1161, 211);
		panel.setBorder(new LineBorder(Color.RED, 8));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THANK YOU FOR ORDERING");
		lblNewLabel.setBounds(145, 86, 759, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel.add(lblNewLabel);
		
		JLabel lblYourOrderIs = new JLabel("Your order is confirmed and will Dellivered on one hour");
		lblYourOrderIs.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblYourOrderIs.setBounds(29, 26, 1069, 49);
		panel.add(lblYourOrderIs);
		
		JLabel lblClickBelowButton = new JLabel("Click below button to  order more");
		lblClickBelowButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblClickBelowButton.setBounds(91, 134, 759, 49);
		panel.add(lblClickBelowButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(385, 344, 249, 85);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnClick = new JButton("CLICK");
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 29));
		btnClick.setBounds(23, 11, 204, 63);
		panel_1.add(btnClick);
	}
               
}
