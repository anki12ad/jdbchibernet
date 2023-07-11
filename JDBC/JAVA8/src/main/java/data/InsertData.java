package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Animals", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into AniData values(101,'Parrot','vegtarian'),(102,'Tiger','non-veg'),(103,'Peacock','vegetarian'),(104,'lion','cornivorous'),(105,'elephant','vegetarian')");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
