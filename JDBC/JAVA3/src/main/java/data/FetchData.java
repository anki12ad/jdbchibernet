package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college1", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from collgeData");
		resultSet.next();
		System.out.print(" coll_Id: "+resultSet.getInt(1)+" coll_Name: "+resultSet.getString(2)+" coll_Add: "+resultSet.getString(3)+" coll_phone: "+resultSet.getLong(4));
		connection.close();

	}
}
