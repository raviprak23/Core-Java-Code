package Jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Connection c = null;
		try {
			Class.forName("org.postgresql.Driver");
			DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/raviprakash5?&user=postgres&password=Rp54321@098");

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Connected to database successfully");
	}
}