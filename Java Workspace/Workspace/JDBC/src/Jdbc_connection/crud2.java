package Jdbc_connection;

import java.sql.*;

public class crud2 {

	// JDBC driver and database URL
	// static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/mydatabase2";

	// Database credentials
	static final String USER = "postgres";
	static final String PASS = "Rp54321@098";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		int choice;

		try {
			// Register JDBC driver
			// Class.forName(JDBC_DRIVER);

			// Open a connection
			// conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Prompt user for CRUD operation
			System.out.println("Choose an operation:\n1. Create\n2. Read\n3. Update\n4. Delete");
			choice = Integer.parseInt(System.console().readLine());

			switch (choice) {
			case 1: // CREATE
				stmt = conn.createStatement();
				String sql = "INSERT INTO mytable2 (id, name) VALUES (?, ?)";
				stmt.executeUpdate(sql);
				System.out.println("Record created successfully");
				break;
			case 2: // READ
				stmt = conn.createStatement();
				sql = "SELECT * FROM mytable";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					System.out.println("ID: " + id + ", Name: " + name);
				}
				rs.close();
				break;
			case 3: // UPDATE
				stmt = conn.createStatement();
				sql = "UPDATE mytable SET name= ? WHERE id=?";
				stmt.executeUpdate(sql);
				System.out.println("Record updated successfully");
				break;
			case 4: // DELETE
				stmt = conn.createStatement();
				sql = "DELETE FROM mytable WHERE id=?";
				stmt.executeUpdate(sql);
				System.out.println("Record deleted successfully");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// Close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}