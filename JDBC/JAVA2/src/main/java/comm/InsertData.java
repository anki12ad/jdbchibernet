package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
		System.out.println("connection establish");
		Statement statement = connection.createStatement();
		statement.execute("insert into BankData values(1,'SBI','rajajinagar','banglore'),(2,'kanara','SSpuram','tumkur'),(3,'IDFC','Jpnagar','banglore'),(4,'Axis','ssit','mysore'),(5,'HDFC','kanakpura','coorg')");
		connection.close();
		System.out.println("inserted");
	}
}
