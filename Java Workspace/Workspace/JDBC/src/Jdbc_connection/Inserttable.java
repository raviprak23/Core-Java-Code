package Jdbc_connection;

//public class Inserttable {

//}

//package jdbc;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement; 

public class Inserttable {
    
 public static void main(String args[]) { 
  
    Connection conn = null; 
       try {      
        conn = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres", "Rp54321@098"); 
        Statement stmt = conn.createStatement();
        String sql = "insert into car values('Maruti', 'zeta', 800000);";
        stmt.executeUpdate(sql);
        sql = "insert into car values('Innova', 'crysta', 2600000);";
        stmt.executeUpdate(sql);
        sql = "insert into car values('Hyundai', 'Creta', 1300000);";
        stmt.executeUpdate(sql);
        
       } catch (Exception e) { 
        e.printStackTrace(); 
        System.err.println(e.getClass().getName()+": "+e.getMessage()); 
        System.exit(0); 
    } 
    System.out.println("Inserted Successfully"); 
   }
  }
