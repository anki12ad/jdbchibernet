package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Animals", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.execute("create table AniData(Ani_Id int primary key,Ani_Name varchar(20),Ani_Type varchar(20))");
		System.out.println("Database created successfully");
		connection.close();
	}
}
