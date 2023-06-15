package com.jdbc.m4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB {

	static String url = "jdbc:mysql://localhost:3306/TESTDB";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			// Step 1 : Connecting to the Server and Selecting Database
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Database TESTDB SELECTED Successfully");

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
