package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from studentData");
		resultSet.next();
		System.out.print(" stu_Id: "+resultSet.getInt(1)+" stu_Name: "+resultSet.getString(2)+" stu_Password: "+resultSet.getString(3)+" emp_Phone: "+resultSet.getLong(4));
		connection.close();

	}
}
