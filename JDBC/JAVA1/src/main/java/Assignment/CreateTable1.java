package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.execute("create table colData(col_Id int primary key,col_name varchar(20),col_Email varchar(20) unique,col_phone bigInt unique)");
		connection.close();
		System.out.println("Database created successfully");
	}
	}
