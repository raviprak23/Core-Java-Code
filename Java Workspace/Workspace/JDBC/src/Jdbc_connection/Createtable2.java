package Jdbc_connection;

//public class Createtable2 {

//}
//package JDBC; 
import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.Statement; 
 
public class Createtable2 { 
 public static void main(String args[]) {  
        Connection table = null;  
        try {       
         table = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres", "Rp54321@098");  
         Statement s = table.createStatement(); 
         String sql = "DROP Table Bike";
         s.executeUpdate(sql); 
          
        } catch (Exception e) {  
         e.printStackTrace();  
         System.err.println(e.getClass().getName()+": "+e.getMessage());  
         System.exit(0);  
     }  
     System.out.println("Table Created Successfully");  
    } 
  }