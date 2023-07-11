package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from schoolData");
		resultSet.next();
		System.out.print(" sch_Id: "+resultSet.getInt(1)+" sch_Name: "+resultSet.getString(2)+" sch_Add: "+resultSet.getString(3)+" sch_Phone: "+resultSet.getLong(4));
		connection.close();

	}
}
