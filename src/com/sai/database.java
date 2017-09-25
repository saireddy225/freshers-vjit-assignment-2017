package com.sai;

import java.sql.*;

public class database {
	
	
	
	    Connection con;
	    PreparedStatement pst;
	    ResultSet rs;
	    database()
	    {
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
	                        pst=con.prepareStatement("select * from customer where Email=? and Password=?");
	             
	           }
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
	    }
	        
	    public Boolean checkLogin(String uname,String pwd)
	    {
	        try {
	                        
	            pst.setString(1, uname); 
	            pst.setString(2, pwd);    
	            
	            rs=pst.executeQuery();
	            if(rs.next())
	            {
	                
	                return true;
	            }
	            else
	            {
	                return false;
	            }
	        } catch (Exception e) {
	            
	            System.out.println("error while validating"+e);
	            return false;
	        }
	}
}
