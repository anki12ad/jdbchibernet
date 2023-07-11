
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from hotData");
		resultSet.next();
		System.out.print(" hot_Admin: "+resultSet.getInt(1)+" hot_Name: "+resultSet.getString(2)+" hol_Items: "+resultSet.getString(3)+" hol_phone: "+resultSet.getLong(4));
		connection.close();

	}
}
