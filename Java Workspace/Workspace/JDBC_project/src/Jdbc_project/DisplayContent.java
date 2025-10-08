package Jdbc_project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DisplayContent {

	Statement stmt = null;
	Connection conn = null;

	public DisplayContent(Statement stmt, Connection conn) {
		this.stmt = stmt;
		this.conn = conn;
	}

	public void displayDetails(String sql) {
		try {
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					System.out.print(rs.getString(i));
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}