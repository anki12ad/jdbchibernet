package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/deportment1", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update deptData set dept_phone=857523423 where dept_Id=104");
		statement.execute("update deptData set dept_Name='zoology' where dept_Id=101");
		connection.close();
	}
}
