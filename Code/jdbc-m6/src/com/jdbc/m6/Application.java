package com.jdbc.m6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Application {

	static String url = "jdbc:mysql://localhost:3306/loboticket";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			insertAct(conn, "Baby Driver", null);
		}
	}

	private static void insertAct(Connection conn, String name, String recordLabel) throws SQLException {
		String sql = "insert into Acts(name, recordLabel) values(?,?)";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, name);

			if (recordLabel != null)
				ps.setString(2, recordLabel);
			else
				ps.setNull(2, Types.CHAR);

			ps.executeUpdate();
		}

	}

	private static void selectWithGetObject(Connection conn) throws SQLException {
		String sql = "select  name, capacity from venues where name like ?";

		var stmt = conn.prepareStatement(sql);
		stmt.setString(1, "%the%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			String name = null;
			int capacity = 0;

			Object nameValue = rs.getObject("name");
			if (nameValue instanceof String)
				name = (String) nameValue;

			Object capacityValue = rs.getObject("capacity");
			if (capacityValue instanceof Integer)
				capacity = (int) capacityValue;

			System.out.println(name + " has capacity " + capacity);

		}
	}

	private static void countWithName(Connection conn) throws SQLException {
		String sql = "select count(*) as count from gigs";

		var stmt = conn.prepareStatement(sql);

		var rs = stmt.executeQuery();

		if (rs.next()) {

			System.out.println("The number of gigs is " + rs.getInt("count"));

		}
	}

	private static void countWithIndex(Connection conn) throws SQLException {
		String sql = "select count(*) from gigs";

		var stmt = conn.prepareStatement(sql);

		var rs = stmt.executeQuery();

		if (rs.next()) {

			System.out.println("The number of gigs is " + rs.getInt(1));

		}
	}

	private static void useResultSetWithName(Connection conn) throws SQLException {
		// String sql = "select capacity, name from venues where name like ?";
		String sql = "select  name, capacity from venues where name like ?";

		var stmt = conn.prepareStatement(sql);
		stmt.setString(1, "%the%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			String name = rs.getString("name");
			int capacity = rs.getInt("capacity");

			System.out.println(name + " has capacity " + capacity);

		}
	}

	private static void useResultSetWithIds(Connection conn) throws SQLException {
		String sql = "select name, capacity from venues where name like ?";

		var stmt = conn.prepareStatement(sql);
		stmt.setString(1, "%the%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			String name = rs.getString(1);
			int capacity = rs.getInt(2);

			System.out.println(name + " has capacity " + capacity);

		}
	}

}