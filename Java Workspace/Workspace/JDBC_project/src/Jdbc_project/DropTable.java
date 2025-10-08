package Jdbc_project;

import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
	Validate validate = new Validate();

	public void drop(Statement stmt) {
		try {
			System.out.print("Enter table name to drop: ");
			Object tableName = validate.getValidData();
			String sql = "DROP TABLE " + tableName;
			stmt.executeUpdate(sql);
			System.out.println("Table " + tableName + " dropped successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}