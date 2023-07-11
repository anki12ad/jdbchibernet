package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/XYZ", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.execute("create table ABCData(S_Id int primary key,S_Fname varchar(20) not null,S_Lname varchar(20) not null,Degree varchar(20) not null,Stream varchar(20) not null,Email varchar(20) unique,Phone bigInt not null,S_Add varchar(20) not null,City varchar(10) not null,State varchar(20) not null,pincode int not null)");
		connection.close();
		System.out.println("Database created successfully");
	}
}
