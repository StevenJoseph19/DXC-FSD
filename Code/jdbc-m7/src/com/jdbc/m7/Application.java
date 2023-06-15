package com.jdbc.m7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;

public class Application {

	static String url = "jdbc:mysql://localhost:3306/loboticket";
	static String username = "root";
	static String password = "password";

	public static void main(String[] args) throws SQLException {

		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			csExceptionHandler(conn);

		}

	}

	private static void csExceptionHandler(Connection conn) throws SQLException {
		var sql = "{call InsertNewAct(?, ?, ?,?) }";

		try (CallableStatement cs = conn.prepareCall(sql)) {
			cs.setInt(1, 10);
			cs.setString(2, "Foo Faddaooseey");
			cs.setString(3, "Das Kapitollly");

			cs.registerOutParameter(4, Types.VARCHAR);

			cs.execute();

			System.out.println("Message is: " + cs.getString(4));

		}
	}

	private static void csSetNewPriceWithInOutParameter(Connection conn) throws SQLException {
		var sql = "{call SetNewPrice(?, ?, ?) }";

		try (CallableStatement cs = conn.prepareCall(sql)) {
//				cs.setInt(1, 1);
			cs.setInt(1, 2);
			cs.setDouble(2, 0.2);
			cs.setDouble(3, 12.0);

			cs.registerOutParameter(3, Types.DECIMAL);

			cs.execute();

			System.out.println("New price: " + cs.getDouble(3));

		}
	}

	private static void cgGetTotalSalesWithOutParameter(Connection conn) throws SQLException {
		var sql = "{ call GetTotalSales(?)}";

		try (CallableStatement cs = conn.prepareCall(sql)) {
			cs.registerOutParameter(1, Types.DOUBLE);

			cs.execute();

			System.out.println("Total sales is: " + cs.getDouble(1));

		}
	}

	private static void csGigReportInDateRange(Connection conn) throws SQLException {
		var sql = "{ call GigReport(?,?)}";

		try (CallableStatement cs = conn.prepareCall(sql)) {
			cs.setDate("startdate", Date.valueOf(LocalDate.of(2022, 11, 1)));
			cs.setDate("enddate", Date.valueOf(LocalDate.of(2022, 11, 7)));

			var rs = cs.executeQuery();

			while (rs.next()) {
				var date = rs.getDate("date");
				var name = rs.getString("act");
				var recordLabel = rs.getString("recordLabel");
				var venue = rs.getString("venue");
				var ticketsSold = rs.getInt("ticketsSold");
				var capacity = rs.getInt("ticketsSold");

				System.out.println(
						date + " " + name + " " + recordLabel + " " + venue + " " + ticketsSold + " " + capacity);
			}
		}
	}

	private static void csGetActsWithRecordLabel(Connection conn) throws SQLException {
		var sql = "{ call GetActs()}";

		try (CallableStatement cs = conn.prepareCall(sql)) {
			var rs = cs.executeQuery();

			while (rs.next()) {
				var name = rs.getString("name");
				var recordLabel = rs.getString("recordLabel");

				System.out.println(name + " " + recordLabel);
			}
		}
	}

}