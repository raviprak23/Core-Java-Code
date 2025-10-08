package Jdbc_connection;

import java.sql.*;
import java.util.Scanner;

public class crud {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		@SuppressWarnings("unused")
		Statement stm = null;
		// Connection table = null;

		Scanner scanner = new Scanner(System.in); // TAKING USER FROM THE INPUT
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/cloud", "postgres", "Rp54321@098");
			stm = conn.createStatement();

			Statement s1 = conn.createStatement();
			String sql = "CREATE TABLE raviprakash (id integer not null, name varchar(50), email varchar(50), phone integer not null);";
			s1.executeUpdate(sql);

			while (true) {
				System.out.println("Enter operation (1=Create, 2=Insert, 3=Read, 4=Update, 5=Delete, 6=Drop, 7=Exit):");
				int op = scanner.nextInt();

				switch (op) {
				/*
				 * case 1:
				 * 
				 * /////////////////Create table from database/////////////////////////////
				 * Statement stat1 = conn.createStatement(); sql = "CREATE DATABASE cloud";
				 * stat1.executeUpdate(sql);
				 * System.out.println("Database Created successfully!"); break;
				 */

				case 2:
					System.out.println("Enter id:");
					int id = scanner.nextInt();
					System.out.println("Enter name:");
					String name = scanner.next();
					System.out.println("Enter email:");
					String email = scanner.next();
					System.out.println("Enter phone:");
					String phone = scanner.next();
					@SuppressWarnings("unused")
					String sq2 = "INSERT INTO raviprakash (id, name, email, phone) VALUES (?, ?, ?, ?)";

					s1.executeUpdate("insert into raviprakash values('" + id + "', '" + name + "', '" + email + "', '"
							+ phone + "')");

					System.out.println("A new user was inserted successfully!");
					break;

				case 3: // READ
					sql = "SELECT * FROM raviprakash";
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						// int id = rs.getInt("id");
						String userid = rs.getString("id");
						String userName = rs.getString("name");
						String userEmail = rs.getString("email");
						String userPhone = rs.getString("phone");
						System.out.println("\t" + userid + "\t" + userName + "\t" + userEmail + "\t" + userPhone);
					}
					break;

				case 4: // UPDATE
					System.out.println("Enter id:");
					int id1 = scanner.nextInt();
					System.out.println("Enter new email:");
					email = scanner.next();
					sql = "UPDATE raviprakash SET email=? WHERE id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, email);
					pstmt.setInt(2, id1);
					int rowsUpdated = pstmt.executeUpdate();
					if (rowsUpdated > 0) {
						System.out.println("User with id =" + id1 + " was updated successfully!");
					}
					break;

				case 5: // DELETE
					System.out.println("Enter id:");
					id = scanner.nextInt();
					sql = "DELETE FROM raviprakash WHERE id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, id);
					int rowsDeleted = pstmt.executeUpdate();
					if (rowsDeleted > 0) {
						System.out.println("User with id =" + id + " was deleted successfully!");
					}
					break;

				case 6:
					Statement stat = conn.createStatement();
					sql = "DROP table raviprakash";
					stat.executeUpdate(sql);
					System.out.println("Table dropped successfully!");

					break;
				case 7:
					/////////////// Exit from database////////////////////////////////////
					System.exit(0);
					System.out.println("Thankyou");
					break;

				default:
					System.out.println("Invalid operation!");
					break;
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			scanner.close();
		}
	}
}
