package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.execute("create table bankData(Bank_Id int primary key,Bank_Name varchar(30) not null,Bank_Branch varchar(20) not null,Bank_Loc varchar(20) not null)");
		connection.close();
		System.out.println("table created");
	}
}
