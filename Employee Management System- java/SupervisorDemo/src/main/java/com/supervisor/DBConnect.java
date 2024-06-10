// Package declaration
package com.supervisor;

// Import required classes from java.sql package
import java.sql.Connection;
import java.sql.DriverManager;

// DBConnect class definition
public class DBConnect {

    // Database connection details
    private static String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
    private static String userName = "root";
    private static String password = "Chathurika123";
    private static Connection con;

    // Method to establish database connection
    public static Connection getConnection() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establish database connection
            con = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            // Handle database connection exception
            System.out.println("Database connection is not successful!!!");
        }
        
        // Return the established connection
        return con;
    }
}