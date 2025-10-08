package Jdbc_project;

import java.sql.*;

public class DisplayTable {
	Statement stmt = null;
	Connection conn = null;

	public DisplayTable(Statement stmt, Connection conn) {
		this.stmt = stmt;
		this.conn = conn;
	}

// for displaying previously present databases 
	public void display() {
		try {
			String sql = "SELECT table_name FROM information_schema.tables WHERE table_type = 'BASE TABLE' AND table_schema NOT IN ('pg_catalog', 'information_schema');";
			DisplayContent display = new DisplayContent(stmt, conn);
			display.displayDetails(sql);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}