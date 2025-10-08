package Jdbc_project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
	Scanner scanner = new Scanner(System.in);

	Connection conn = null;
	Statement stmt = null;
	String tableName;
	String where;
	Validate validate = new Validate();

	public DeleteData(Connection conn, Statement stmt) {
		this.conn = conn;
		this.stmt = stmt;
	}

	public void delete() {
		try {
			System.out.print("Enter table name to delete data: ");
			tableName = validate.getValidData();

			System.out.println("Enter where condition column name: ");
			where = scanner.nextLine();

			System.out.println("Enter where condition value:");
			String value = scanner.nextLine();

			String deleteSql = "DELETE FROM " + tableName + " WHERE " + where + " = " + value + ";";
			int rowsAffected = stmt.executeUpdate(deleteSql);

			if (rowsAffected > 0) {
				System.out.println("Deleted successfully!");
			} else {
				System.out.println("No rows were deleted.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}