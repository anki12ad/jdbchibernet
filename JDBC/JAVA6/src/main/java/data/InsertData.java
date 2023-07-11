package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into hosData values(101,'ESI','Raju',9865438455),(102,'Suguna','Sathish',8764232526),(103,'Pragathi','Sudha',7645242268),(104,'Ramayya','radhakrishna',6530981342),(105,'sparsha','Sowmya',983562453)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
