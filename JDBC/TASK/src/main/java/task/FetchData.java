package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/XYZ", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from XYZ")
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
