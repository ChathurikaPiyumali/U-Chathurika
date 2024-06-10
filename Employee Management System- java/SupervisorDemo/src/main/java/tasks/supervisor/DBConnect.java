package tasks.supervisor;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	// Database connection details
	
	private static String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
	private static String userName = "root";
	private static String password = "Chathurika123";
	
	// Connection object
	private static Connection con;
	
	//Establishes a connection to the database.
	public static Connection getConnection() {
		
		try {
			
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Establish the database connection
			con = DriverManager.getConnection(url,userName,password);
			
		}
		catch (Exception e) {
			 // Handle any exceptions that occur during the connection process
			System.out.println("Database connection is not success!!!");
		}
		
		// Return the established connection
		return con;
	
	}
}
