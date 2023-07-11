package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from bankData");
		resultSet.next();
		System.out.print(" Bank_Id: "+resultSet.getInt(1)+" Bank_Name: "+resultSet.getString(2)+" Bank_Branch: "+resultSet.getString(3)+" Bank_Loc: "+resultSet.getString(4));
		connection.close();

	}

}
