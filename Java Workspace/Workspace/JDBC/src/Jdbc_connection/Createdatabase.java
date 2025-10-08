package Jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createdatabase {

	public static void main(String args[]) {
		// @SuppressWarnings("unused")
		// Connection c = null;
		try {

			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/", "postgres", "Rp54321@098");
			@SuppressWarnings("unused")
			Statement data = conn.createStatement();
			String sql = "CREATE DATABASE raviprakash5";
			// Statement stmt = conn.createStatement();
			// String sql = "CREATE TABLE car (Name varchar(50), Model varchar(50), Price
			// integer not null);";
			data.executeUpdate(sql);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table Created Successfully");
	}
}