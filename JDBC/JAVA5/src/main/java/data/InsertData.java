package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel1", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into hotData values(1,'sagar','Dosa',9865438455),(2,'hut','gobi',8764232526),(3,'vilasi','Kulcha',7645242268),(4,'Savitha','fried rice',6530981342),(5,'madhura','palav',983562453)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
