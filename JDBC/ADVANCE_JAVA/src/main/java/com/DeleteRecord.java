package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from empData where emp_Id=103");
		connection.close();
		System.out.println("record deleted");
	}
}
