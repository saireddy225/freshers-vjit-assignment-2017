package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ReserveTable {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void RTScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReserveTable window = new ReserveTable();
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
	public ReserveTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 29));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.MAGENTA);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Break Fast", "Lunch", "Dinner" }));
		comboBox.setBounds(328, 148, 243, 30);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel = new JLabel("Rubi Restaurant");
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 74));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(259, 11, 706, 76);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblCategory.setBounds(144, 141, 147, 37);
		frame.getContentPane().add(lblCategory);

		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(77, 366, 365, 233);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Table1", "Table2", "Table3", "Table4", "Table5",
				"Table6", "Table7", "Table8", "Table9", "Table10" }));
		comboBox_1.setBounds(73, 99, 205, 40);
		panel.add(comboBox_1);

		JLabel lblBreakFast = new JLabel("Break Fast");
		lblBreakFast.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBreakFast.setBounds(104, 63, 139, 25);
		panel.add(lblBreakFast);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(494, 366, 365, 233);
		frame.getContentPane().add(panel_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Table1", "Table2", "Table3", "Table4", "Table5",
				"Table6", "Table7", "Table8", "Table9", "Table10" }));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_2.setBounds(73, 99, 205, 40);
		panel_1.add(comboBox_2);

		JLabel lblLunch = new JLabel("Lunch");
		lblLunch.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblLunch.setBounds(104, 63, 139, 25);
		panel_1.add(lblLunch);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(933, 366, 365, 233);
		frame.getContentPane().add(panel_2);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "Table1", "Table2", "Table3", "Table4", "Table5",
				"Table6", "Table7", "Table8", "Table9", "Table10" }));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox_3.setBounds(73, 99, 205, 40);
		panel_2.add(comboBox_3);

		JLabel lblDinner = new JLabel("Dinner");
		lblDinner.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDinner.setBounds(104, 63, 139, 25);
		panel_2.add(lblDinner);

		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblCustomerId.setBounds(144, 240, 171, 37);
		frame.getContentPane().add(lblCustomerId);

		textField = new JTextField();
		textField.setBounds(328, 240, 243, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnReseve = new JButton("RESERVE");
		btnReseve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if ((comboBox.getSelectedItem().equals("Break Fast"))) {
				
					if (ae.getSource() == btnReseve) {
						if ((comboBox_1.getModel()) != null) {
						String c_id=textField.getText();
						
						  String t1 = (String)comboBox_1.getSelectedItem();
						
						
						
						
						Connection con;
						PreparedStatement pst1;
						PreparedStatement pst;
						try {
						
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
							pst1=con.prepareStatement("ALTER TABLE breakfasttable ADD UNIQUE (breakfast)");
							int j=pst1.executeUpdate();
							
							pst = con.prepareStatement(
									"INSERT INTO  breakfasttable(customer_id,breakfast )  VALUES (?,?) "
									);
							pst.setString(1, c_id);
						
							pst.setString(2, t1);
							
							
							int i = pst.executeUpdate();
							if (i > 0) {
								JOptionPane.showMessageDialog(null, "Table Reserved");
								TableConfirmed tc =new  TableConfirmed();
								tc.tcScreen();
							} else {
								JOptionPane.showMessageDialog(null, "check the reserved tables list and try to select another table");
							}
						} catch (SQLException ex) {
							JOptionPane.showMessageDialog(null, "check the reserved tables list and try to select another table");
						}
						
					}
				}
			}
				if ((comboBox.getSelectedItem().equals("Lunch"))) {
					
					if (ae.getSource() == btnReseve) {
						if ((comboBox_2.getModel()) != null) {
						String c_id=textField.getText();
						
						  String t1 = (String)comboBox_2.getSelectedItem();
						
						
						
						Connection con;
						PreparedStatement pst1;
						PreparedStatement pst;
						try {
						
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
							pst1=con.prepareStatement("ALTER TABLE lunchtable ADD UNIQUE (tablesreserved)");
							int j=pst1.executeUpdate();
							
							pst = con.prepareStatement(
									"INSERT INTO lunchtable(customer_id,tablesreserved)  VALUES (?,?) "
									);
							pst.setString(1, c_id);
						
							pst.setString(2, t1);
							
							int i = pst.executeUpdate();
							if (i > 0) {
								JOptionPane.showMessageDialog(null, "Table Reerved");
								TableConfirmed tc =new  TableConfirmed();
								tc.tcScreen();
							} else {
								JOptionPane.showMessageDialog(null, "check the reserved tables list and try to select another table");
							}
						} catch (SQLException ex) {
							JOptionPane.showMessageDialog(null, "check the reserved tables list and try to select another table");
						}
						
					}
				}
			}
if ((comboBox.getSelectedItem().equals("Dinner"))) {
					
					if (ae.getSource() == btnReseve) {
						if ((comboBox_3.getModel()) != null) {
						String c_id=textField.getText();
						
						  String t1 = (String)comboBox_3.getSelectedItem();
						
					
						
						Connection con;
						PreparedStatement pst1;
						PreparedStatement pst;
						try {
						
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
							pst1=con.prepareStatement("ALTER TABLE dinnertable ADD UNIQUE (reservedtable)");
							int j=pst1.executeUpdate();
							
							pst = con.prepareStatement(
									"INSERT INTO dinnertable(customer_id,	reservedtable )  VALUES (?,?) "
									);
							pst.setString(1, c_id);
						
							pst.setString(2, t1);
							
							int i = pst.executeUpdate();
							if (i > 0) {
								JOptionPane.showMessageDialog(null, "Table Reserved");
								TableConfirmed tc =new  TableConfirmed();
								tc.tcScreen();
							} else {
								JOptionPane.showMessageDialog(null, "check the reserved tables list and try to select another table");
							}
						} catch (SQLException ex) {
							JOptionPane.showMessageDialog(null, "check the reserved tables list and try to select another table");
						}
						
					}
				}
			}
			}
			
		});
		btnReseve.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnReseve.setBounds(439, 610, 154, 29);
		frame.getContentPane().add(btnReseve);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations op=new operations();
				op.opScreen();
				
			}
		});
		btnNewButton.setBounds(680, 609, 134, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 29));
	}
}
