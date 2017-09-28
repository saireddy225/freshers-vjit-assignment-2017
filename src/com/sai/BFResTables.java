package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class BFResTables {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void bfScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BFResTables window = new BFResTables();
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
	public BFResTables() {
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
		
		JLabel lblNewLabel = new JLabel("Tables Reserved");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblNewLabel.setBounds(388, 43, 1442, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con;
					PreparedStatement pst;
					ResultSet rs;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
					pst = con.prepareStatement("select breakfast from breakfasttable");
					rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
			}
		});
		btnLoad.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnLoad.setBounds(489, 152, 163, 45);
		frame.getContentPane().add(btnLoad);
		
		table = new JTable();
		table.setBounds(333, 239, 535, 263);
		frame.getContentPane().add(table);
	}
}
