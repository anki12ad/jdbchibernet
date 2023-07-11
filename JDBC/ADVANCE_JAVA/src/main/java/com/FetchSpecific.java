package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchSpecific {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from empData where emp_Id=103");
	resultSet.next();
	System.out.print(" emp_Id: "+resultSet.getInt(1)+" emp_Name: "+resultSet.getString(2)+" emp_Sal: "+resultSet.getInt(3)+" emp_email: "+resultSet.getString(4)+" emp_Phone: "+resultSet.getLong(5));
	connection.close();
}
}
