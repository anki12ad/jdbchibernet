package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataIntoSpecific {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement statement = connection.createStatement();
		statement.executeUpdate("update empData set emp_role='Developer' where emp_Id=101");
		statement.executeUpdate("update empData set emp_role='software' where emp_Id=102");
		statement.executeUpdate("update empData set emp_role='manager' where emp_Id=103");
		statement.executeUpdate("update empData set emp_role='associate' where emp_Id=104");
		statement.executeUpdate("update empData set emp_role='' where emp_Id=103");
		System.out.println("Update data successfully");
		connection.close();
	}
}
