package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update stuData set stu_phone=8575423 where stu_Id=104");
		statement.execute("update stuData set stu_Name='Likhith' where stu_Id=101");
		connection.close();
	}
}
