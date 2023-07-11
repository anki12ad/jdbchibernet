package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from hosData");
		resultSet.next();
		System.out.print(" hos_Admin: "+resultSet.getInt(1)+" hos_Name: "+resultSet.getString(2)+" hos_Fname: "+resultSet.getString(3)+" hos_phone: "+resultSet.getLong(4));
		connection.close();

	}
}
