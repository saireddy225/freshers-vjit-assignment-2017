package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoginTwo extends JFrame {

	JLabel l_name, l_pass;
	JTextField t_name;
	JPasswordField t_pass;
	JButton button;
	Container c;

	handler handle;

	database db;
	private JComboBox comboBox;
	private JLabel lblLoginAs;

	LoginTwo() {
		super("Login form");

		c = getContentPane();

		db = new database();
		handle = new handler();

		l_name = new JLabel("Username");
		l_name.setBounds(10, 8, 70, 14);
		l_pass = new JLabel("Password");
		l_pass.setBounds(11, 33, 69, 14);
		t_name = new JTextField(10);
		t_name.setBounds(75, 5, 86, 20);
		t_pass = new JPasswordField(10);
		t_pass.setBounds(74, 30, 86, 20);
		button = new JButton("Login");
		button.setBounds(100, 68, 74, 23);

		button.addActionListener(handle);
		getContentPane().setLayout(null);

		c.add(l_name);
		c.add(t_name);
		c.add(l_pass);
		c.add(t_pass);
		c.add(button);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Customer","Manager", "Chef",  "Host","Server"}));
		comboBox.setBounds(10, 69, 80, 20);
		getContentPane().add(comboBox);

		lblLoginAs = new JLabel("login as");
		lblLoginAs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLoginAs.setBounds(24, 54, 46, 14);
		getContentPane().add(lblLoginAs);
		// visual
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 130);

	}

	public static void lt() {
		LoginTwo sample = new LoginTwo();
	}

	class handler implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			if ((comboBox.getSelectedItem().equals("Customer"))) {
				if (ae.getSource() == button) {
					char[] temp_pwd = t_pass.getPassword();
					String pwd = null;
					pwd = String.copyValueOf(temp_pwd);
					System.out.println("Username,Pwd:" + t_name.getText());

					if (db.checkLogin(t_name.getText(), pwd)) {

						JOptionPane.showMessageDialog(null, "You have logged in successfully", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						operations op = new operations();
						op.opScreen();
						

					} else {

						JOptionPane.showMessageDialog(null, "Login failed!", "Failed!!", JOptionPane.ERROR_MESSAGE);
					}
				} } if ((comboBox.getSelectedItem().equals("Manager"))) {
					if (ae.getSource() == button) {
						char[] temp_pwd1 = t_pass.getPassword();
						String pwd1 = null;
						pwd1 = String.copyValueOf(temp_pwd1);
						System.out.println("Username,Pwd:" + t_name.getText());

						if (db.mngcheckLogin(t_name.getText(), pwd1)) {

							JOptionPane.showMessageDialog(null, "You have logged in successfully", "Success",
									JOptionPane.INFORMATION_MESSAGE);
							Manager m = new Manager();
							m.M();

						} else {

							JOptionPane.showMessageDialog(null, "Login failed!", "Failed!!", JOptionPane.ERROR_MESSAGE);
						}
					}

				}
				if ((comboBox.getSelectedItem().equals("Host"))) {
					if (ae.getSource() == button) {
						char[] temp_pwd1 = t_pass.getPassword();
						String pwd1 = null;
						pwd1 = String.copyValueOf(temp_pwd1);
						System.out.println("Username,Pwd:" + t_name.getText());

						if (db.hstcheckLogin(t_name.getText(), pwd1)) {

							JOptionPane.showMessageDialog(null, "You have logged in successfully", "Success",
									JOptionPane.INFORMATION_MESSAGE);
							host h=new host();
							h.hScreen();

						} else {

							JOptionPane.showMessageDialog(null, "Login failed!", "Failed!!", JOptionPane.ERROR_MESSAGE);
						}
					}

				}
				if ((comboBox.getSelectedItem().equals("Chef"))) {
					if (ae.getSource() == button) {
						char[] temp_pwd1 = t_pass.getPassword();
						String pwd1 = null;
						pwd1 = String.copyValueOf(temp_pwd1);
						System.out.println("Username,Pwd:" + t_name.getText());

						if (db.chfLogin(t_name.getText(), pwd1)) {

							JOptionPane.showMessageDialog(null, "You have logged in successfully", "Success",
									JOptionPane.INFORMATION_MESSAGE);
							Chef ch = new Chef();
							ch.Ch();

						} else {

							JOptionPane.showMessageDialog(null, "Login failed!", "Failed!!", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
						if ((comboBox.getSelectedItem().equals("Server"))) {
							if (ae.getSource() == button) {
								char[] temp_pwd1 = t_pass.getPassword();
								String pwd1 = null;
								pwd1 = String.copyValueOf(temp_pwd1);
								System.out.println("Username,Pwd:" + t_name.getText());

								if (db.serLogin(t_name.getText(), pwd1)) {

									JOptionPane.showMessageDialog(null, "You have logged in successfully", "Success",
											JOptionPane.INFORMATION_MESSAGE);
									SERVER e=new SERVER();
									e.seScreen();

								} else {

									JOptionPane.showMessageDialog(null, "Login failed!", "Failed!!", JOptionPane.ERROR_MESSAGE);
								}
					}
			}
		}
	}
	
}
