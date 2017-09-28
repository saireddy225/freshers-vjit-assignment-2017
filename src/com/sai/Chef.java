package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Chef {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JLabel lblTakeawayOrders;
	private JTable table_2;
	private JScrollPane scrollPane_1;
	private JButton btnLoad_1;

	/**
	 * Launch the application.
	 */
	public static void Ch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chef window = new Chef();
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
	public Chef() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNormalOrders = new JLabel("Normal Orders");
		lblNormalOrders.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNormalOrders.setBounds(148, 48, 336, 37);
		frame.getContentPane().add(lblNormalOrders);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con;
					PreparedStatement pst;
					ResultSet rs;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
					pst = con.prepareStatement("select * from mngorder");
					rs=pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
			}
		});
		btnLoad.setBounds(199, 126, 89, 23);
		frame.getContentPane().add(btnLoad);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 160, 661, 370);
		frame.getContentPane().add(scrollPane);
		
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		lblTakeawayOrders = new JLabel("Takeaway Orders");
		lblTakeawayOrders.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTakeawayOrders.setBounds(975, 48, 229, 37);
		frame.getContentPane().add(lblTakeawayOrders);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(681, 162, 661, 365);
		frame.getContentPane().add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);
		
		btnLoad_1 = new JButton("LOAD");
		btnLoad_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con;
					PreparedStatement pst;
					ResultSet rs;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
					pst = con.prepareStatement("select * from foodordered");
					rs=pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
			}
		});
		btnLoad_1.setBounds(1049, 126, 89, 23);
		frame.getContentPane().add(btnLoad_1);
	}
}
