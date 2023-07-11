package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root");
		System.out.println("CONNECTION ESTABLISH");
		Statement statement=connection.createStatement();
		statement.execute("create table empData(emp_Id int primary key,emp_name varchar(30),emp_sal int not null,emp_Email varchar(20) unique,emp_Phone bigInt unique)");
		connection.close();
		System.out.println("TABLE CREATED SUCCESSFULLY");
	}
}
