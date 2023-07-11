package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into empData values(104,'Deepz',10000,'deepz51@gmail.com',9865438455),(102,'lochu',5000,'lochu2@gmail.com',8764232526),(103,'pinnu',6000,'pinnu3@gmail.com',7645242268)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
