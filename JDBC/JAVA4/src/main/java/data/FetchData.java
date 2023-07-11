package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/XYZ", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from ABCData where Stream not in('mech','CS')");
		while(resultSet.next()){
		System.out.print("s_Id: "+resultSet.getInt(1)+" S_Fname: "+resultSet.getString(2)+" S_Lname: "+resultSet.getString(3)+" Degree: "+resultSet.getString(4)+"Stream: "+resultSet.getString(5)+"Email: "+resultSet.getString(6)+" Phone: "+resultSet.getLong(7)+" S_Add: "+resultSet.getString(8)+" City: "+resultSet.getString(9)+" State: "+resultSet.getString(10)+" Pincode: "+resultSet.getString(11));
		}
		connection.close();
	}
}
