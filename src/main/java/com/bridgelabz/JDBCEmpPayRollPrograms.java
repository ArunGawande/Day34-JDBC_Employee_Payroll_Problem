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

			PreparedStatement pStmt = connection.prepareStatement("update employeepayroll set salary=5000 where id=4;");

			int affectedRows = pStmt.executeUpdate("update employeepayroll set salary=300000 where id=4;");

			System.out.println("affectedRows :=" + affectedRows);

		} catch (SQLException e) {

			System.out.println("Unable to connect to DB...");

		} finally {

			connection.close();

		}

	}

}