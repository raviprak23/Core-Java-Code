package Jdbc_connection;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Inserttable2 {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	Connection conn = null;
	int num;
	int rows;
	String name;
	String model;
	int price;
	//String sql;
	
 
	       try {      
	        conn = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres", "Rp54321@098"); 
	        Statement s = conn.createStatement(); 
	         String sql = "CREATE TABLE bike (Name varchar(50), Model varchar(50), Price integer not null);"; 
	         s.executeUpdate(sql);
	         
	         System.out.println("Enter the number of rows: ");
	         rows = input.nextInt();
	         
	         
	         for(int i = 0; i < rows; i++){
	        	 num = i+1;
	        	 System.out.println("Input for id:"+num);
	        	 System.out.println("Enter the name of bike: ");
	        	 name = input.next();
	        	 System.out.println("Enter the model of bike");
	        	 model = input.next();
	        	 System.out.println("Enter the price of bike");
	        	 price = input.nextInt();
	        	 
	        	 
	        sql = "insert into bike values('"+name+"', '"+model+"', '"+price+"');";
	        s.executeUpdate(sql);
	         }
	        
	        
	       } catch (Exception e) { 
	        e.printStackTrace(); 
	        System.err.println(e.getClass().getName()+": "+e.getMessage()); 
	        System.exit(0); 
	    } 
	    System.out.println("Inserted Successfully");
	    input.close();
	    
	   }
	  
	}


