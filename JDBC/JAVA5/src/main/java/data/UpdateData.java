package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update hotData set hol_Phone=84575423 where hot_Admin=104");
		statement.execute("update hotData set hol_Items='Panner' where hot_Admin=101");
		connection.close();
	}
}
