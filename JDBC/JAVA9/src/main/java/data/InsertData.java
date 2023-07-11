package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiles", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into mobData values(101,'Oneplus','android',376),(102,'Iphone','Apple X',986),(103,'Samsung','Android A13',732),(104,'redmi','android1',521),(105,'oppo','Android F1',563)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
