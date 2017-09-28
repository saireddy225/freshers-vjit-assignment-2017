package com.sai;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;

public class VegMenu {

	JFrame frame;
	private JTextField gmn;
	private JTextField jtxtmb;
	private JTextField pb;
	private JTextField jgi;
	private JTextField cid;
	private JTextField cm;
	private JTextField cb;
	private JTextField mb;
	private JTextField cn;

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
		
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 61));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(658, 0, 801, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBackground(Color.RED);
		panel.setBounds(10, 95, 488, 380);
		frame.getContentPane().add(panel);
		
		JLabel gm = new JLabel("GOBI MANCHURIAN(5$)");
		gm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		gm.setBounds(21, 50, 242, 33);
		panel.add(gm);
		
		JLabel mm = new JLabel("MUSHROOM MANCHURIAN(10$)");
		mm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		mm.setBounds(10, 122, 327, 47);
		panel.add(mm);
		
		gmn = new JTextField();
		gmn.setText("0");
		gmn.setColumns(10);
		gmn.setBounds(337, 54, 97, 34);
		panel.add(gmn);
		
		jtxtmb = new JTextField();
		jtxtmb.setText("0");
		jtxtmb.setColumns(10);
		jtxtmb.setBounds(337, 134, 97, 33);
		panel.add(jtxtmb);
		
		JLabel pm = new JLabel("PANNEER MANCHURIAN(15$)");
		pm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		pm.setBounds(21, 204, 306, 33);
		panel.add(pm);
		
		pb = new JTextField();
		pb.setText("0");
		pb.setColumns(10);
		pb.setBounds(337, 210, 97, 31);
		panel.add(pb);
		
		JLabel gi = new JLabel("GOBI-65(20$)");
		gi.setFont(new Font("Tahoma", Font.PLAIN, 22));
		gi.setBounds(21, 281, 242, 33);
		panel.add(gi);
		
		jgi = new JTextField();
		jgi.setText("0");
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
				double gm=Double.parseDouble(gmn.getText());
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
				double lblChickenManchurian=Double.parseDouble(cm.getText());
				double icm=5;
				double  tcm;
				tcm=(lblChickenManchurian*icm);
				String gMeal1=String.format("%f$", tcm);
				cof.setText(gMeal1);
				double lblChickenBiryani=Double.parseDouble(cb.getText());
				double icb=10;
				double  tcb;
				tcb=(lblChickenBiryani*icb);
				String mMeal1=String.format("%f$", tcm+tcb);
				cof.setText(mMeal1);
				double lblMuttonBirayni=Double.parseDouble(mb.getText());
				double imb=15;
				double  tmb;
				tmb=(lblMuttonBirayni*imb);
				String pMeal1=String.format("%f$", tcm+tcb+tmb);
				cof.setText(pMeal1);
				double lblChickenNoodles=Double.parseDouble(cn.getText());
				double icn=20;
				double  tcn;
				tcn=(lblChickenNoodles*icn);
				String giMeal1=String.format("%f$", tcm+tcb+tmb+tcn+tgm+tmm+tpm+tgi);
				cof.setText(giMeal1);
				double cd;
				cd=10;
				String cdMeal=String.format("%f$", cd);
				cod.setText(cdMeal);
				
				
				
				
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
		panel_4.setBounds(990, 177, 361, 462);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("      Click below ");
		label.setBounds(44, 41, 255, 44);
		label.setFont(new Font("Tahoma", Font.PLAIN, 36));
		panel_4.add(label);
		
		JLabel label_1 = new JLabel("    to");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		label_1.setBounds(136, 120, 72, 39);
		panel_4.add(label_1);
		
		JLabel lblConfirm = new JLabel("Confirm Order");
		lblConfirm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConfirm.setBounds(114, 208, 205, 28);
		panel_4.add(lblConfirm);
		
		JButton btnNewButton = new JButton("CHECK OUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c_id=Double.parseDouble(cid.getText());
				double gm=Double.parseDouble(gmn.getText());
				double mm=Double.parseDouble(jtxtmb.getText());
				double pm=Double.parseDouble(pb.getText());
				double gi=Double.parseDouble(jgi.getText());
				double lblChickenManchurian=Double.parseDouble(cm.getText());
				double lblChickenBiryani=Double.parseDouble(cb.getText());
				double lblMuttonBirayni=Double.parseDouble(mb.getText());
				double lblChickenNoodles=Double.parseDouble(cn.getText());
				try {
					Connection con;
					PreparedStatement pst;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
					pst = con.prepareStatement(
							"INSERT INTO foodordered(customer_id, gobimanchurian, mushroommanchurian, panneermanchurian, gobi65,chickenmanchurian,	chickenbiryani,	muttonbiryani,chickennoodles )  VALUES (?,?,?,?,?,?,?,?,?)");
					
					pst.setDouble(1, c_id);
					pst.setDouble(2, gm);
					pst.setDouble(3, mm);
					pst.setDouble(4, pm);
					pst.setDouble(5, gi);
					pst.setDouble(6, lblChickenManchurian);
					pst.setDouble(7, lblChickenBiryani);
					pst.setDouble(8, lblMuttonBirayni);
					pst.setDouble(9, lblChickenNoodles);
					
			
					
					
					

                    					
					int i = pst.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Order Placed");
					} else {
						JOptionPane.showMessageDialog(null, "Order not Placed");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				

				OrderConfirmed oc=new OrderConfirmed();
				oc.NewScreen2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(107, 326, 212, 32);
		panel_4.add(btnNewButton);
		
		JLabel lblCustomerId = new JLabel("customer ID");
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCustomerId.setBounds(70, 26, 144, 30);
		frame.getContentPane().add(lblCustomerId);
		
		cid = new JTextField();
		cid.setBounds(224, 31, 171, 25);
		frame.getContentPane().add(cid);
		cid.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(508, 95, 472, 380);
		frame.getContentPane().add(panel_2);
		
		JLabel label_2 = new JLabel("Chicken MANCHURIAN(5$)");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_2.setBounds(10, 55, 286, 33);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Chicken Biryani(10$)");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_3.setBounds(10, 122, 327, 47);
		panel_2.add(label_3);
		
		cm = new JTextField();
		cm.setText("0");
		cm.setColumns(10);
		cm.setBounds(337, 54, 97, 34);
		panel_2.add(cm);
		
		cb = new JTextField();
		cb.setText("0");
		cb.setColumns(10);
		cb.setBounds(337, 134, 97, 33);
		panel_2.add(cb);
		
		JLabel lblMuttonBirayni_1 = new JLabel("Mutton Birayni(15$)");
		lblMuttonBirayni_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMuttonBirayni_1.setBounds(10, 204, 317, 33);
		panel_2.add(lblMuttonBirayni_1);
		
		mb = new JTextField();
		mb.setText("0");
		mb.setColumns(10);
		mb.setBounds(337, 210, 97, 31);
		panel_2.add(mb);
		
		JLabel label_5 = new JLabel("Chicken Noodles (20$)");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_5.setBounds(10, 281, 253, 33);
		panel_2.add(label_5);
		
		cn = new JTextField();
		cn.setText("0");
		cn.setColumns(10);
		cn.setBounds(337, 287, 97, 31);
		panel_2.add(cn);
	}
}
