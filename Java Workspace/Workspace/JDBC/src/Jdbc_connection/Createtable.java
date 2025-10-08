package Jdbc_connection;

//public class Createtable {

//}
//package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createtable {

	public static void main(String args[]) {
		// @SuppressWarnings("unused")
		// Connection c = null;
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/raviprakash3", "postgres",
					"Rp54321@098");
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE car (Name varchar(50), Model varchar(50), Price integer not null);";
			stmt.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table Created Successfully");
	}
}