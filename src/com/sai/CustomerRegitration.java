package com.sai;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.sai.LoginTwo.handler;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CustomerRegitration {

	private JFrame frame;
	private JTextField name;
	private JTextField Email;
	private JTextField phone;
	private JPasswordField pwd;
	private JPasswordField c_pwd;
	private JTextField uid;
	

	/**
	 * Launch the application.
	 */
	public static void CR() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegitration window = new CustomerRegitration();
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
	public CustomerRegitration() {
		initialize();
		 
          
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("RUBI RESTAURANT");
		label.setForeground(Color.RED);
		label.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 64));
		label.setBackground(new Color(152, 251, 152));
		label.setBounds(196, 11, 1187, 96);
		frame.getContentPane().add(label);
		
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setForeground(Color.RED);
		lblRegistration.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 64));
		lblRegistration.setBackground(new Color(152, 251, 152));
		lblRegistration.setBounds(328, 78, 1187, 96);
		frame.getContentPane().add(lblRegistration);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(123, 230, 159, 30);
		frame.getContentPane().add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(488, 230, 394, 30);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEmail.setBounds(123, 297, 159, 30);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPassword.setBounds(123, 362, 159, 30);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConfirmPassword.setBounds(123, 431, 256, 30);
		frame.getContentPane().add(lblConfirmPassword);
		
		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_4.setBounds(366, 522, 159, 30);
		frame.getContentPane().add(label_4);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(488, 305, 394, 30);
		frame.getContentPane().add(Email);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(488, 522, 394, 30);
		frame.getContentPane().add(phone);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPhoneNumber.setBounds(123, 522, 256, 30);
		frame.getContentPane().add(lblPhoneNumber);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String temp_email=Email.getText();
	                String email =null;
	                email=String.valueOf(temp_email);
	                int u_id=Integer.parseInt(uid.getText());
                      
	                
	                String pwd1 = String.valueOf(pwd.getPassword());
	                
	                String n = name.getText();
	             int ph=Integer.parseInt(phone.getText());
	              String cp=String.valueOf(c_pwd.getPassword());
	            
		               
	               
	               
	                String emailpattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	                          Boolean b = email.matches(emailpattern);
	              
	                if(uid.getText().equals("")||name.getText().equals("")||Email.getText().equals("")||pwd.getPassword().equals("")||c_pwd.getPassword().equals("")||phone.getText().equals(""))
		{
	                	 JOptionPane.showMessageDialog(null, "Enter all fields","try again",
	                                JOptionPane.INFORMATION_MESSAGE);
		}
	                else
	                {
	                	if((b == true)&&(Arrays.equals(pwd.getPassword(), c_pwd.getPassword()))){
	                		 Connection con;
		                 	    PreparedStatement pst;
		                 	   try{
		           	            Class.forName("com.mysql.jdbc.Driver");
		           	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
		           	         pst=con.prepareStatement("INSERT INTO customer(customer_id,Name, Email, Password, ConfirmPassword, Phone_Number )  VALUES (?,?,?,?,?,?)");
		           	         pst.setInt(1, u_id);
		           	                     pst.setString(2,n ); 
		           	  	            pst.setString(3,email);    
		           	  	       pst.setString(4,pwd1);    
		           	  	  pst.setString(5,cp);   
		           		  pst.setInt(6,ph);
		           	  	  int i=pst.executeUpdate();
		           	  	  if(i>0)
		           	  	  {
		           	  		  JOptionPane.showMessageDialog(null,"Data is saved");
		           	  		LoginTwo RL=new LoginTwo();
			                   RL.lt();
		           	  	  }
		           	  	  else {
		           	  		JOptionPane.showMessageDialog(null,"Data is not saved");
		           	  	  }
		                 	   }catch(Exception ex)
		                 	   {
		                 		  JOptionPane.showMessageDialog(null,ex);
		                 	   }
	                    	
	                  
	                	   
	                   
	                }
	                     else if ((b == false)||(!Arrays.equals(pwd.getPassword(), c_pwd.getPassword()))) {
	                    	 
	                    	 if ((b == false)) {
		                    System.out.println("Email Address is Invalid");
		                    JOptionPane.showMessageDialog(null, "Email Address is Invalid","try again",
	                                JOptionPane.INFORMATION_MESSAGE);
	                    
	                    	 }
	                
		                    else if(!Arrays.equals(pwd.getPassword(), c_pwd.getPassword()))
	                {
	                	JOptionPane.showMessageDialog(null, "Passwords does not match","try again",
                                JOptionPane.INFORMATION_MESSAGE);
	                }
		                    
			}
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(587, 583, 215, 43);
		frame.getContentPane().add(btnNewButton);
		
		pwd = new JPasswordField();
		pwd.setBounds(488, 362, 397, 33);
		frame.getContentPane().add(pwd);
		
		c_pwd = new JPasswordField();
		c_pwd.setBounds(488, 438, 397, 33);
		frame.getContentPane().add(c_pwd);
		
		JLabel lblUserid = new JLabel("User_id(Only Numbers)");
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblUserid.setBounds(113, 172, 334, 30);
		frame.getContentPane().add(lblUserid);
		
		uid = new JTextField();
		uid.setColumns(10);
		uid.setBounds(488, 172, 394, 30);
		frame.getContentPane().add(uid);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
