package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEmpPayRollPrograms {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollservice", "root", "Arun@12345");

			Statement stmt = connection.createStatement();

			ResultSet result = stmt.executeQuery("select * from employeepayroll;");

			while (result.next()) {
				System.out.println(result.getInt(1) + "    " + result.getString(2) + "   " + result.getString(3) + "   "
						+ result.getString(4) + "   " + result.getString(5));

			}
		} catch (SQLException e) {

			System.out.println("Unable to connect to DB...");

		} finally {

			connection.close();

		}
	}
}