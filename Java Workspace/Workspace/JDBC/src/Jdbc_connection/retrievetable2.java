package Jdbc_connection;


import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class retrievetable2 {
	 public void retrieve(Statement stmt) {
		  try {
			Connection  conn = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres", "Rp54321@098"); 
		        Statement s = conn.createStatement(); 
		        
		   ResultSet res = stmt.executeQuery("Select * from bike");
		   System.out.println("Id  Name       model      Price");
		   
		   while (res.next()) {
		    int id = res.getInt("id");
		    String name = res.getString("name");
		    String model = res.getString("model");
		    int price = res.getInt("price");
		    System.out.println(id + "  " + name + "   " + model + "   " + price);
		   }
		  } catch (Exception e) { 
		   e.printStackTrace(); 
		   System.err.println(e.getClass().getName()+": "+e.getMessage()); 
		   System.exit(0); 
		  } 
	 }
	 
}
		

