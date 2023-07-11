package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiles", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from mobData");
		resultSet.next();
		System.out.print(" mob_Id: "+resultSet.getInt(1)+" mob_Name: "+resultSet.getString(2)+" mob_Type: "+resultSet.getString(3)+" mob_pin: "+resultSet.getInt(4));
		connection.close();

	}
}
