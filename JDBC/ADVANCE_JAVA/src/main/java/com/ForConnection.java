
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ForConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		System.out.println("connection establish");
		Statement statement= connection.createStatement();
		statement.execute("create database employee");
		System.out.println("DataBase created Successfully");
		connection.close();

	}

}
