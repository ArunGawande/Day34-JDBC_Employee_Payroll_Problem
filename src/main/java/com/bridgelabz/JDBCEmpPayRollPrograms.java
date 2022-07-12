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
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollservice", "root",
					"Arun@12345");

			Statement stmt = connection.createStatement();

			stmt.execute("insert into employeepayroll value(15,'Karan','200000','1996-01-01','M','Nagpur','Store','10k','2k','10','20','30')");

		} catch (SQLException e) {

			System.out.println("Unable to connect to DB...");

		} finally {

			connection.close();
		}

	}

}