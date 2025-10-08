package Jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	Scanner scan = new Scanner(System.in);
	Statement stmt = null;
	Connection conn = null;
	String name;
	Validate validate = new Validate();

	final String DB_URL = "jdbc:postgresql://localhost/";
	final String USER = "postgres";
	final String PASS = "Rp54321@098";

	public void createDb() throws SQLException {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement s = conn.createStatement();
			System.out.println("Enter name to create database:");
			name = validate.getValidData();

			String db = ("CREATE DATABASE " + name + "");
			s.execute(db);
			System.out.println("Database Created Successfully");

		} catch (Exception e) {
			System.out.println("Database Already Present Please Create New Database");
			name = validate.getValidData();
			Statement s = conn.createStatement();
			String db = ("CREATE DATABASE " + name + "");
			s.execute(db);
			System.out.println("New Database Created Succesfully");
		}
		connectToDb(name);
	}
	
	/**
	 * Method to establish connection with Database
	 * @param name : name of the Database
	 * @throws SQLException
	 */
	public void connectToDb(String name) throws SQLException {
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost/" + name + "", "postgres", "Rp54321@098");
			stmt = conn.createStatement();
			System.out.println("Database connected to " + name + "!!");
			Choice.setConn(conn);
			Choice.setStmt(stmt);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not able to connect to DB, please try again!!");
		}
	}

	public void listExistingDB() {
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			DisplayContent display = new DisplayContent(stmt, conn);
			String sql = "SELECT datname FROM pg_database WHERE datistemplate = false;";
			display.displayDetails(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}