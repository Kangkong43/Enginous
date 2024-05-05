/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package finalprojectoop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Database {

    
    public static Connection myCon(){
        // Initialize the database connection variable
    Connection con = null;
    
    //Using try-catch to handle errors
   
    try{
        // Load the JDBC driver class for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
         // Establish a connection to the MySQL database using DriverManager
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","alifahFarah30");
    }catch(Exception e){
        // Print the exception stack trace if an exception occurs
    System.out.println(e);
    
    }
    
    // Return the database connection object (may be null if connection fails)
    return con;
    }
}
