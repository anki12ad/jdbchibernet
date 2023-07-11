package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.execute("create table schoolData(sch_Id int primary key,sch_Name varchar(20),sch_Add varchar(20),sch_phone bigInt unique)");
		connection.close();
		System.out.println("Database created successfully");
	}
}
