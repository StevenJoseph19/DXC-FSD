package com.jdbc.m4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	static String url = "jdbc:mysql://localhost:3306/";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			// Step 1 : Connecting to the Server
			con = DriverManager.getConnection(url, username, password);
			// Step 2 : Initialize statement
			stmt = con.createStatement();
			// Step 3 : SQL Query
			String query = "DROP DATABASE TESTDB";
			// Step 4 : Run Query
			stmt.executeUpdate(query);
			System.out.println("Database TESTDB Deleted Successfully.");

		} catch (SQLException e) {
			System.err.println("Cannot connect !");
			e.printStackTrace();

		} finally {
			System.out.println("Closing the connection.");
			if (con != null)
				try {
					con.close();
				} catch (SQLException ignore) {
					// TODO: handle exception
				}
		}

	}

}
