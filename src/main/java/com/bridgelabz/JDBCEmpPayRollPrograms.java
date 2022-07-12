package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEmpPayRollPrograms {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollService", "root", "Arun@12345");

			Statement stmt = connection.createStatement();

			int affectedRows = stmt.executeUpdate("update employeepayroll set salary=300000000 where id=5;");

			System.out.println("affectedRows :=" + affectedRows);

		} catch (SQLException e) {

			System.out.println("Unable to connect to DB...");

		} finally {

			connection.close();

		}

	}

}