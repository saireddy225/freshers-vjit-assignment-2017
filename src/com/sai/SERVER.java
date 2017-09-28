package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;

public class SERVER {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void seScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SERVER window = new SERVER();
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
	public SERVER() {
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
		
		JLabel label = new JLabel("");
		label.setBounds(340, 37, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnLoadData = new JButton("LOAD DATA");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection con;
					PreparedStatement pst;
					ResultSet rs;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
					pst = con.prepareStatement("select * from mngorder");
					rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
				
			}
		});
		btnLoadData.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnLoadData.setBounds(421, 46, 240, 64);
		frame.getContentPane().add(btnLoadData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 138, 898, 276);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

}
