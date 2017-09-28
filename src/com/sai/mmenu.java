package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class mmenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void mScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mmenu window = new mmenu();
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
	public mmenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 102, 51));
		frame.getContentPane().setForeground(new Color(204, 0, 102));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBackground(Color.RED);
		panel.setBounds(10, 158, 488, 481);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("GOBI MANCHURIAN(5$)");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(10, 50, 253, 33);
		panel.add(label);
		
		JLabel label_1 = new JLabel("MUSHROOM MANCHURIAN(10$)");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_1.setBounds(10, 122, 327, 47);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("PANNEER MANCHURIAN(15$)");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_2.setBounds(10, 204, 317, 33);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("GOBI-65(20$)");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_3.setBounds(10, 285, 253, 33);
		panel.add(label_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(517, 158, 472, 481);
		frame.getContentPane().add(panel_1);
		
		JLabel label_4 = new JLabel("Chicken MANCHURIAN(5$)");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_4.setBounds(10, 55, 286, 33);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Chicken Biryani(10$)");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_5.setBounds(10, 122, 327, 47);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Mutton Birayni(15$)");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_6.setBounds(10, 204, 317, 33);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("Chicken Noodles (20$)");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_7.setBounds(10, 281, 253, 33);
		panel_1.add(label_7);
		
		JLabel lblNewLabel = new JLabel("Rubi Restaurant");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(269, 21, 552, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLoginToOrder = new JLabel("Login to order Items");
		lblLoginToOrder.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblLoginToOrder.setBackground(new Color(153, 153, 102));
		lblLoginToOrder.setBounds(1014, 185, 328, 132);
		frame.getContentPane().add(lblLoginToOrder);
	}

}
