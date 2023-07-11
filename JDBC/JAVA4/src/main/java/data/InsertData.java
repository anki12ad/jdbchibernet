package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deportment1", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into deptData values(101,'CS','cs@34',9865438455),(102,'Maths','Maths@134',8764232526),(103,'Chemistry','chemistry@675',7645242268),(104,'biology','bio#456',6530981342),(105,'social','Social',983562453)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
