package com.jdbc.m5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {

	static String url = "jdbc:mysql://localhost:3306/loboticket";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			String sql = "insert into venues(name, capacity)  values(?,?) ";

			var stmt = conn.prepareStatement(sql);
			stmt.setObject(1, "Empire State Park");
			stmt.setObject(2, 3000);

			int result = stmt.executeUpdate();

			if (result > 0)
				System.out.println("Update the database");
		}
	}

	private static void selectWithParameters(Connection conn) throws SQLException {
		String sql = "select name, capacity from venues where name like ?";

		var stmt = conn.prepareStatement(sql);
		stmt.setString(1, "%the%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.print(".");

		}

		System.out.println();
	}

	private static void executeUpdateWithWrongNumberOfParameters(Connection conn) throws SQLException {
		String sql = "insert into venues(name, capacity)  values(?,?) ";

		var stmt = conn.prepareStatement(sql);
		stmt.setString(1, "Empire State Park");
		stmt.setInt(2, 3000);
		stmt.setInt(3, 3000);

		int result = stmt.executeUpdate();

		if (result > 0)
			System.out.println("Update the database");
	}

	private static void insertMultipleValues(Connection conn) throws SQLException {
		String sql = "insert into venues(name, capacity)  values(?,?) ";

		var stmt = conn.prepareStatement(sql);
		stmt.setString(1, "Empire State Park");
		stmt.setInt(2, 3000);

		int result = stmt.executeUpdate();

		if (result > 0)
			System.out.println("Update the database");

		stmt.setString(1, "London Hyde Park");

		result = stmt.executeUpdate();

		if (result > 0)
			System.out.println("Update the database");
	}

	private static void simpleSelectWithExecute(Connection conn) throws SQLException {
		String sql = "select name, capacity from venues";

		var stmt = conn.prepareStatement(sql);

		boolean result = stmt.execute();

		if (result) {
			var rs = stmt.getResultSet();
			while (rs.next()) {
				System.out.print(".");
			}
			System.out.println();

		}
	}

	private static void simpleInsertWithExecute(Connection conn) throws SQLException {
		String sql = "insert into venues(name, capacity)  values('The House Next Door', 20) ";

		var stmt = conn.prepareStatement(sql);

		boolean result = stmt.execute();

		if (!result) {
			if (stmt.getUpdateCount() > 0)

				System.out.print("Update the database");
			else
				System.out.print("No Update");
		} else {
			System.out.println("Result was not  a count");
		}
	}

	private static void simpleDeleteWithExecuteUpdate(Connection conn) throws SQLException {
		String sql = "delete from venues where name ='The House Next Door'";

		var stmt = conn.prepareStatement(sql);

		int result = stmt.executeUpdate();

		if (result > 0) {
			System.out.print("Update the database");
		} else {
			System.out.print("Update failed");
		}
		System.out.println();
	}

	private static void simpleUpdateWithExecuteUpdate(Connection conn) throws SQLException {
		String sql = "update venues set capacity = 30 where name ='The House Next Door'";

		var stmt = conn.prepareStatement(sql);

		int result = stmt.executeUpdate();

		if (result > 0) {
			System.out.print("Update the database");
		}
		System.out.println();
	}

	private static void simpleInsertWithExecuteUpdate(Connection conn) throws SQLException {
		String sql = "insert into venues(name, capacity)  values('The House Next Door', 20) ";

		var stmt = conn.prepareStatement(sql);

		int result = stmt.executeUpdate();

		if (result > 0) {
			System.out.print("Update the database");
		}
		System.out.println();
	}

	private static void simpleReadWithExecuteQuery(Connection conn) throws SQLException {
		String sql = "select name, capacity from venues";

		var stmt = conn.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.print(".");

		}

		System.out.println();
	}
}