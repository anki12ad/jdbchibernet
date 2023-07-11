package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college1", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update collgeData set coll_phone=857542093 where coll_Id=104");
		statement.execute("update collgeData set coll_Name='vvfgc' where coll_Id=101");
		connection.close();
	}
}
