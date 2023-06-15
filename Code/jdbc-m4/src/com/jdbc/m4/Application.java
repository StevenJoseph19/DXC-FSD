package com.jdbc.m4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

	static String url = "jdbc:mysql://localhost:3306/loboticket";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection(url, username, password);
			 PreparedStatement stmt = conn.prepareStatement("select * from Acts")) {
			
//			PreparedStatement stmt = conn.prepareStatement("select * from Acts")
			var results = stmt.executeQuery();

			while (results.next()) {
				System.out.println(results.getString("Name"));

			}
		}

	}
}