package com.sai;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;

public class VegMenu {

	private JFrame frame;
	private JTextField jtxtcb;
	private JTextField jtxtmb;
	private JTextField pb;
	private JTextField jgi;
	private JTextField cl;
	private JTextField cl1;
	private JTextField cl2;
	private JTextField cl3;
	private JTextField cl4;
	private JTextField cl5;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VegMenu window = new VegMenu();
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
	public VegMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 38));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VEG LIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 61));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(408, 11, 801, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBackground(Color.RED);
		panel.setBounds(70, 99, 488, 380);
		frame.getContentPane().add(panel);
		
		JLabel gm = new JLabel("GOBI MANCHURIAN(5$)");
		gm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		gm.setBounds(21, 50, 242, 33);
		panel.add(gm);
		
		JLabel mm = new JLabel("MUSHROOM MANCHURIAN(10$)");
		mm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		mm.setBounds(10, 122, 327, 47);
		panel.add(mm);
		
		jtxtcb = new JTextField();
		jtxtcb.setColumns(10);
		jtxtcb.setBounds(337, 54, 97, 34);
		panel.add(jtxtcb);
		
		jtxtmb = new JTextField();
		jtxtmb.setColumns(10);
		jtxtmb.setBounds(337, 134, 97, 33);
		panel.add(jtxtmb);
		
		JLabel pm = new JLabel("PANNEER MANCHURIAN(15$)");
		pm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		pm.setBounds(21, 204, 306, 33);
		panel.add(pm);
		
		pb = new JTextField();
		pb.setColumns(10);
		pb.setBounds(337, 210, 97, 31);
		panel.add(pb);
		
		JLabel gi = new JLabel("GOBI-65(20$)");
		gi.setFont(new Font("Tahoma", Font.PLAIN, 22));
		gi.setBounds(21, 281, 242, 33);
		panel.add(gi);
		
		jgi = new JTextField();
		jgi.setColumns(10);
		jgi.setBounds(337, 287, 97, 31);
		panel.add(jgi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(10, 502, 423, 137);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel COF = new JLabel("Cost of food");
		COF.setBounds(30, 27, 162, 40);
		COF.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_1.add(COF);
		
		
		JLabel cof = new JLabel("");
		cof.setForeground(Color.WHITE);
		cof.setBackground(Color.RED);
		cof.setBounds(306, 27, 90, 33);
		panel_1.add(cof);
		cof.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel COD = new JLabel("Cost of Delivery ");
		COD.setFont(new Font("Tahoma", Font.PLAIN, 24));
		COD.setBounds(30, 89, 176, 21);
		panel_1.add(COD);
		
		JLabel cod = new JLabel("");
		cod.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cod.setBackground(Color.RED);
		cod.setBounds(306, 77, 90, 33);
		panel_1.add(cod);
		
		JPanel j = new JPanel();
		j.setBackground(Color.CYAN);
		j.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		j.setBounds(460, 502, 434, 137);
		frame.getContentPane().add(j);
		j.setLayout(null);
		
		JButton total = new JButton("TOTAL");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double gm=Double.parseDouble(jtxtcb.getText());
				double igm=5;
				double  tgm;
				tgm=(gm*igm);
				String gMeal=String.format("%f$", tgm);
				cof.setText(gMeal);
				double mm=Double.parseDouble(jtxtmb.getText());
				double imm=10;
				double  tmm;
				tmm=(mm*imm);
				String mMeal=String.format("%f$", tgm+tmm);
				cof.setText(mMeal);
				double pm=Double.parseDouble(pb.getText());
				double ipm=15;
				double  tpm;
				tpm=(pm*ipm);
				String pMeal=String.format("%f$", tgm+tmm+tpm);
				cof.setText(pMeal);
				double gi=Double.parseDouble(jgi.getText());
				double igi=20;
				double  tgi;
				tgi=(gi*igi);
				String giMeal=String.format("%f$", tgm+tmm+tpm+tgi);
				cof.setText(giMeal);
				double cd;
				cd=10;
				String cdMeal=String.format("%f$", cd);
				cod.setText(cdMeal);
				double tot;
				tot=cd+tgm+tmm+tpm+tgi;
				
				String tcMeal=String.format("%f$", tot);
				
				total.setText(tcMeal);
				
				
			}
		});
		total.setFont(new Font("Tahoma", Font.PLAIN, 27));
		total.setForeground(Color.RED);
		total.setBackground(Color.WHITE);
		total.setBounds(90, 73, 162, 41);
		j.add(total);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(90, 26, 91, 36);
		j.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1179, 391, 2, 2);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(1340, 0, 12, 2);
		frame.getContentPane().add(scrollPane_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLUE);
		panel_4.setBounds(904, 99, 438, 540);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("      Click below ");
		label.setBounds(74, 39, 255, 44);
		label.setFont(new Font("Tahoma", Font.PLAIN, 36));
		panel_4.add(label);
		
		JLabel label_1 = new JLabel("    to");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_1.setBounds(174, 125, 72, 39);
		panel_4.add(label_1);
		
		JLabel lblConfirm = new JLabel("Review Order");
		lblConfirm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConfirm.setBounds(136, 207, 205, 28);
		panel_4.add(lblConfirm);
		
		JButton btnClick = new JButton("CLICK");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double gm=Double.parseDouble(jtxtcb.getText());
				double igm=5;
				double  tgm;
				tgm=(gm*igm);
				String gMeal=String.format("Gobi Manchuian:%f$", tgm);
				cl.setText(gMeal);
				double mm=Double.parseDouble(jtxtmb.getText());
				double imm=10;
				double  tmm;
				tmm=(mm*imm);
				String mMeal=String.format("Muhroom Manchurian :%f$", tmm);
				cl1.setText(mMeal);
				double pm=Double.parseDouble(pb.getText());
				double ipm=15;
				double  tpm;
				tpm=(pm*ipm);
				String pMeal=String.format("Pannneer Manchurian%f$", tpm);
				cl2.setText(pMeal);
				double gi=Double.parseDouble(jgi.getText());
				double igi=20;
				double  tgi;
				tgi=(gi*igi);
				String giMeal=String.format("Gobi-65 %f$", tgi);
				cl3.setText(giMeal);
				double cd;
				cd=10;
				String cdMeal=String.format("Cost Of Delivery%f$", cd);
				cl4.setText(cdMeal);
				double tot;
				tot=cd+tgm+tmm+tpm+tgi;
				
				String tcMeal=String.format("Total COST:%f$", tot);
				
				cl5.setText(tcMeal);
				
				
			}
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnClick.setBounds(146, 246, 147, 33);
		panel_4.add(btnClick);
		
		cl = new JTextField();
		cl.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cl.setBounds(10, 290, 407, 28);
		panel_4.add(cl);
		cl.setColumns(10);
		
		cl1 = new JTextField();
		cl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cl1.setColumns(10);
		cl1.setBounds(10, 324, 407, 28);
		panel_4.add(cl1);
		
		cl2 = new JTextField();
		cl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cl2.setColumns(10);
		cl2.setBounds(10, 363, 407, 28);
		panel_4.add(cl2);
		
		cl3 = new JTextField();
		cl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cl3.setColumns(10);
		cl3.setBounds(10, 404, 407, 28);
		panel_4.add(cl3);
		
		cl4 = new JTextField();
		cl4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cl4.setColumns(10);
		cl4.setBounds(10, 448, 407, 28);
		panel_4.add(cl4);
		
		cl5 = new JTextField();
		cl5.setBounds(10, 487, 185, 42);
		panel_4.add(cl5);
		cl5.setColumns(10);
		
		JButton btnNewButton = new JButton("CHECK OUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderConfirmed oc=new OrderConfirmed();
				oc.NewScreen2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(205, 497, 212, 32);
		panel_4.add(btnNewButton);
	}
}
