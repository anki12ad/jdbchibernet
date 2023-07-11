package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiles", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update mobData set mob_Name='vivo' where mob_Id=104");
		connection.close();
	}
}
