package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class LResTables {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void lScreen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LResTables window = new LResTables();
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
	public LResTables() {
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
		
		JLabel label = new JLabel("Tables Reserved");
		label.setBounds(317, 33, 1352, 56);
		label.setFont(new Font("Tahoma", Font.PLAIN, 46));
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Load");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con;
					PreparedStatement pst;
					ResultSet rs;
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
					pst = con.prepareStatement("select tablesreserved from lunchtable");
					rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex);
					}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.setBounds(410, 136, 163, 45);
		frame.getContentPane().add(button);
		
		table = new JTable();
		table.setBounds(215, 235, 535, 263);
		frame.getContentPane().add(table);
	}

}
