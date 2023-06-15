package com.jdbc.m3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

	static String url = "jdbc:mysql://localhost:3306/loboticket";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) throws SQLException {

//		Class.forName("com.mysql.cj.jdbc"); // Old way of loading the driver

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println(conn);
		}

	}
}