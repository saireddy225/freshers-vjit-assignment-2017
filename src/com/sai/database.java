package com.sai;

import java.io.Reader;
import java.sql.*;

public class database {
	
	
	
	    Connection con;
	    PreparedStatement pst;
	    PreparedStatement mngpst;
	    PreparedStatement chfpst;
	    PreparedStatement hstpst;
	    PreparedStatement spst;
	    ResultSet rs;
	    ResultSet rs1;
	    database()
	    {
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
	                        pst=con.prepareStatement("select * from customer where Email=? and Password=?");
	                       mngpst=con.prepareStatement("select * from mnglogin where UserName=? and Password=?");
	                       chfpst=con.prepareStatement("select * from cheflogin where UserName=? and Password=?");
	                       hstpst=con.prepareStatement("select * from hostlogin where Username=? and password=?");
                              spst=con.prepareStatement("select * from serlogin where UserName=? and password=?");

	             
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

		public boolean mngcheckLogin(String un, String pwd1) {
			// TODO Auto-generated method stub
			try {
                
	            mngpst.setString(1, un); 
	            mngpst.setString(2, pwd1);    
	            
	            rs1=mngpst.executeQuery();
	            if(rs1.next())
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
		public boolean hstcheckLogin(String un, String pwd1) {
			// TODO Auto-generated method stub
			try {
                
	            hstpst.setString(1, un); 
	            hstpst.setString(2, pwd1);    
	            
	            rs1=hstpst.executeQuery();
	            if(rs1.next())
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


		public boolean chfLogin(String un, String pwd1) {
			// TODO Auto-generated method stub
try {
                
	            chfpst.setString(1, un); 
	            chfpst.setString(2, pwd1);    
	            
	            rs1=chfpst.executeQuery();
	            if(rs1.next())
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

		public boolean serLogin(String un, String pwd1) {
			
			
try {
                
	            spst.setString(1, un); 
	            spst.setString(2, pwd1);    
	            
	            rs1=spst.executeQuery();
	            if(rs1.next())
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

		

