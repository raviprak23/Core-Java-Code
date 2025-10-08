package Jdbc_connection;

//public class cruddatabase {

//}
 
import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.Statement; 
 //import java.sql.*;
public class cruddatabase { 
  public static void main(String args[]) {  
         Connection table = null;  
         try {       
          table = DriverManager.getConnection("jdbc:postgresql://localhost/", "postgres", "Rp54321@098");  
           Statement s = table.createStatement(); 
           String db = "Create DATABASE cloud"; 
           s.execute(db); 
 
//           Statement s1 = table.createStatement(); 
//           String sql = "CREATE TABLE employee1 (name varchar(50), email varchar(50), phone integer not null);"; 
//           s1.executeUpdate(sql); 
           
         } catch (Exception e) {  
          e.printStackTrace();  
          System.err.println(e.getClass().getName()+": "+e.getMessage());  
          System.exit(0);  
      }  
      System.out.println("Database  Created Successfully");  
     } 
   }