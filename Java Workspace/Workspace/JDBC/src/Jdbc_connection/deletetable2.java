//package Jdbc_connection;

//public class deletetable2 {

//}
package Jdbc_connection;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deletetable2 {
	public void delete(Statement stmt) {
		  Scanner input = new Scanner(System.in);
		  int id;
		  String sql;
		  
		  try {
			  Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres", "Rp54321@098"); 
		        Statement s = conn.createStatement();
		   System.out.println("\nEnter the Id to delete: ");
		   id = input.nextInt();
		   sql = "delete from bike where id = "+id+";";
		   stmt.executeUpdate(sql);
		   input.close();
		   
		  } catch (Exception e) { 
		   e.printStackTrace(); 
		   System.err.println(e.getClass().getName()+": "+e.getMessage()); 
		   System.exit(0); 
		  } 
		  System.out.println("Deleted Successfully"); 
		 } 
		}