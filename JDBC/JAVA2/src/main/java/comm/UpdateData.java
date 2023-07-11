package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update BankData set Bank_Name='kotak'where Bank_Id=103");
		connection.close();
	}
}
