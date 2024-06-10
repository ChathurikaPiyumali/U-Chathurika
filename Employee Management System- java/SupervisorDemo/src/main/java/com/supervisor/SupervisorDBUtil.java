package com.supervisor;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class SupervisorDBUtil {
	
	
	private static boolean isSuccess;  //instant variable
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//Validates the given user name and password against the database.
	public static boolean validate(String username ,String password) {

		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from supervisor where username='"+username+"' and password='"+password+"'" ;                                       
			rs = stmt.executeQuery(sql);
		
			
			if(rs.next()) {
				isSuccess = true;	
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	//Retrieves the supervisor details based on the given user name
	public static List<Supervisor> getSupervisor(String username ){
		ArrayList<Supervisor> sup = new ArrayList<>();
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from supervisor where username='"+username+"'" ;                                       
			rs = stmt.executeQuery(sql);
		
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				Supervisor s = new Supervisor(id,name,email,phone,userU,passU);
				
				sup.add(s);
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		return sup;
	}
	
	
	
	//Inserts a new supervisor into the database
	
	public static boolean insertsupervisor(String name,String email,String phone , String username,String password) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into supervisor values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql); 
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//Updates the details of a supervisor in the database.
	
	public static boolean updatesupervisor(String id,String name,String email, String phone , String username , String password) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update supervisor set name = '"+name+"',email = '"+email+"',phone = '"+phone+"',username = '"+username+"',password= '"+password+"'"
					      + "where id = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;	
			}
			else
			{
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	//Retrieves the details of a supervisor based on the given ID.
	
	public static List<Supervisor> getSupervisorDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		ArrayList<Supervisor> sup = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from supervisor where id ='"+convertedID+"'" ;
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Supervisor s = new Supervisor(id , name, email,phone, username,password);
				sup.add(s);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	
		return sup;
	}
	
	
	// Deletes a supervisor from the database based on the given ID.
	
	public static boolean deleteSupervisor(String id) {
		
		int convId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from supervisor where id ='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if (r>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	

	
	
}
