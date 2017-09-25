package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NonVegMenu {

	private JFrame frame;
	private JTextField cm;
	private JTextField cb;
	private JTextField mb;
	private JTextField cn;
	private JTextField c;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField c4;
	private JTextField c5;

	/**
	 * Launch the application.
	 */
	public  void NVScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NonVegMenu window = new NonVegMenu();
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
	public NonVegMenu() {
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
		
		JLabel lblNonVegList = new JLabel("NON-VEG LIST");
		lblNonVegList.setBounds(519, 11, 1352, 74);
		lblNonVegList.setForeground(Color.RED);
		lblNonVegList.setFont(new Font("Tahoma", Font.PLAIN, 61));
		frame.getContentPane().add(lblNonVegList);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBackground(Color.RED);
		panel.setBounds(10, 93, 488, 380);
		frame.getContentPane().add(panel);
		
		JLabel lblChickenManchurian = new JLabel("Chicken MANCHURIAN(5$)");
		lblChickenManchurian.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblChickenManchurian.setBounds(10, 55, 286, 33);
		panel.add(lblChickenManchurian);
		
		JLabel lblChickenBiryani = new JLabel("Chicken Biryani(10$)");
		lblChickenBiryani.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblChickenBiryani.setBounds(10, 122, 327, 47);
		panel.add(lblChickenBiryani);
		
		cm = new JTextField();
		cm.setColumns(10);
		cm.setBounds(337, 54, 97, 34);
		panel.add(cm);
		
		cb = new JTextField();
		cb.setColumns(10);
		cb.setBounds(337, 134, 97, 33);
		panel.add(cb);
		
		JLabel lblMuttonBirayni = new JLabel("Mutton Birayni15$)");
		lblMuttonBirayni.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMuttonBirayni.setBounds(10, 204, 317, 33);
		panel.add(lblMuttonBirayni);
		
		mb = new JTextField();
		mb.setColumns(10);
		mb.setBounds(337, 210, 97, 31);
		panel.add(mb);
		
		JLabel lblChickenNoodles = new JLabel("Chicken Noodles (20$)");
		lblChickenNoodles.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblChickenNoodles.setBounds(10, 281, 253, 33);
		panel.add(lblChickenNoodles);
		
		cn = new JTextField();
		cn.setColumns(10);
		cn.setBounds(337, 287, 97, 31);
		panel.add(cn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(10, 513, 423, 137);
		frame.getContentPane().add(panel_1);
		
		JLabel label = new JLabel("Cost of food");
		label.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label.setBounds(30, 27, 162, 40);
		panel_1.add(label);
		
		JLabel cof = new JLabel("");
		cof.setForeground(Color.WHITE);
		cof.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cof.setBackground(Color.RED);
		cof.setBounds(306, 27, 90, 33);
		panel_1.add(cof);
		
		JLabel label_2 = new JLabel("Cost of Delivery ");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_2.setBounds(30, 89, 176, 21);
		panel_1.add(label_2);
		
		JLabel cod = new JLabel("");
		cod.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cod.setBackground(Color.RED);
		cod.setBounds(306, 77, 90, 33);
		panel_1.add(cod);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(452, 513, 434, 137);
		frame.getContentPane().add(panel_2);
		
		JButton total = new JButton("TOTAL");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double lblChickenManchurian=Double.parseDouble(cm.getText());
				double icm=5;
				double  tcm;
				tcm=(lblChickenManchurian*icm);
				String gMeal=String.format("%f$", tcm);
				cof.setText(gMeal);
				double lblChickenBiryani=Double.parseDouble(cb.getText());
				double icb=10;
				double  tcb;
				tcb=(lblChickenBiryani*icb);
				String mMeal=String.format("%f$", tcm+tcb);
				cof.setText(mMeal);
				double lblMuttonBirayni=Double.parseDouble(mb.getText());
				double imb=15;
				double  tmb;
				tmb=(lblMuttonBirayni*imb);
				String pMeal=String.format("%f$", tcm+tcb+tmb);
				cof.setText(pMeal);
				double lblChickenNoodles=Double.parseDouble(cn.getText());
				double icn=20;
				double  tcn;
				tcn=(lblChickenNoodles*icn);
				String giMeal=String.format("%f$", tcm+tcb+tmb+tcn);
				cof.setText(giMeal);
				double cd;
				cd=10;
				String cdMeal=String.format("%f$", cd);
				cod.setText(cdMeal);
				double tot;
				tot=cd+tcm+tcb+tmb+tcn;
				
				String tcMeal=String.format("%f$", tot);
				
				total.setText(tcMeal);
				
			}
		});
		total.setForeground(Color.RED);
		total.setFont(new Font("Tahoma", Font.PLAIN, 27));
		total.setBackground(Color.WHITE);
		total.setBounds(90, 73, 162, 41);
		panel_2.add(total);
		
		JLabel label_4 = new JLabel("TOTAL");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 28));
		label_4.setBounds(90, 26, 91, 36);
		panel_2.add(label_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.BLUE);
		panel_3.setBounds(914, 110, 438, 540);
		frame.getContentPane().add(panel_3);
		
		JLabel label_5 = new JLabel("      Click below ");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 36));
		label_5.setBounds(74, 39, 255, 44);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("    to");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_6.setBounds(174, 125, 72, 39);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("Review Order");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_7.setBounds(136, 207, 205, 28);
		panel_3.add(label_7);
		
		JButton button_1 = new JButton("CLICK");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double lblChickenManchurian=Double.parseDouble(cm.getText());
				double icm=5;
				double  tcm;
				tcm=(lblChickenManchurian*icm);
				String gMeal=String.format("Chicken Manchurian:%f$", tcm);
				c.setText(gMeal);
				double lblChickenBiryani=Double.parseDouble(cb.getText());
				double icb=10;
				double  tcb;
				tcb=(lblChickenBiryani*icb);
				String mMeal=String.format("Chicken Biryani%f$", tcm+tcb);
				c1.setText(mMeal);
				double lblMuttonBirayni=Double.parseDouble(mb.getText());
				double imb=15;
				double  tmb;
				tmb=(lblMuttonBirayni*imb);
				String pMeal=String.format("Mutton Birayni%f$", tcm+tcb+tmb);
				c2.setText(pMeal);
				double lblChickenNoodles=Double.parseDouble(cn.getText());
				double icn=20;
				double  tcn;
				tcn=(lblChickenNoodles*icn);
				String giMeal=String.format("Chicken Noodles%f$", tcm+tcb+tmb+tcn);
				c3.setText(giMeal);
				double cd;
				cd=10;
				String cdMeal=String.format("Cost of delivery:%f$", cd);
				c4.setText(cdMeal);
				double tot;
				tot=cd+tcm+tcb+tmb+tcn;
				
				String tcMeal=String.format("Total %f$", tot);
				
				c5.setText(tcMeal);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		button_1.setBounds(146, 246, 147, 33);
		panel_3.add(button_1);
		
		c = new JTextField();
		c.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c.setColumns(10);
		c.setBounds(10, 290, 407, 28);
		panel_3.add(c);
		
		c1 = new JTextField();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c1.setColumns(10);
		c1.setBounds(10, 324, 407, 28);
		panel_3.add(c1);
		
		c2 = new JTextField();
		c2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c2.setColumns(10);
		c2.setBounds(10, 363, 407, 28);
		panel_3.add(c2);
		
		c3 = new JTextField();
		c3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c3.setColumns(10);
		c3.setBounds(10, 404, 407, 28);
		panel_3.add(c3);
		
		c4 = new JTextField();
		c4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		c4.setColumns(10);
		c4.setBounds(10, 448, 407, 28);
		panel_3.add(c4);
		
		c5 = new JTextField();
		c5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		c5.setColumns(10);
		c5.setBounds(10, 487, 185, 42);
		panel_3.add(c5);
		
		JButton button_2 = new JButton("CHECK OUT");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderConfirmed oc=new OrderConfirmed();
				oc.NewScreen2();
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button_2.setBounds(205, 497, 212, 32);
		panel_3.add(button_2);
	}

}
