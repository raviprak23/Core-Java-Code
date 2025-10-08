//package Jdbc_connection;

//public class Inserttable3 {

//}
package Jdbc_connection;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner; 

public class Inserttable3 {
    
 public static void main(String args[]) { 
	 Scanner input = new Scanner(System.in);
	  int num;
	  int rows;
	  String name;
	  String colour;
	  int price;
	  String s;
	  
	  System.out.println("Enter the number of rows: ");
	  rows = input.nextInt();
	  
  
  Connection conn = null;
  Inserttable ins = new Inserttable();
 // DeleteFurniture del = new DeleteFurniture();
  //RetrieveFurniture ret = new RetrieveFurniture();
  
  try {      
	  
	 // Connection conn = null;
	  //InsertFurniture ins = new InsertFurniture();
  
      conn = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres", "Rp54321@098"); 
      Statement stmt = conn.createStatement();
      
      String sql11 = "CREATE TABLE Bike (Id integer, Name varchar(50), Model varchar(50), Price integer not null);";
      stmt.executeUpdate(sql11);
      
      for (int i = 0; i < rows; i++) {
    	    num = i + 1;
    	    System.out.println("Input for Id: " + num);
    	    System.out.println("Enter the name of Bike: ");
    	    name = input.next();
    	    System.out.println("Enter the model of Bike: ");
    	    colour = input.next();
    	    System.out.println("Enter the price of Bike: ");
    	    price = input.nextInt();
    	    String model = null;
			sql11 = "insert into furniture values("+num+", '"+name+"' , '"+model+"', '"+price+"');";
    	    stmt.executeUpdate(sql11);
    	    System.out.println("Inserted Successfully");
    	   }
    	   input.close();
    	  } catch (Exception e) { 
    	   e.printStackTrace(); 
    	   System.err.println(e.getClass().getName()+": "+e.getMessage()); 
    	   System.exit(0); 
    	  } 
    	 } 
    	}
      
      