package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle1", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from vehData");
		resultSet.next();
		System.out.print(" veh_Id: "+resultSet.getInt(1)+" veh_Name: "+resultSet.getString(2)+" veh_Type: "+resultSet.getString(3)+" veh_No: "+resultSet.getInt(4));
		connection.close();

	}
}
