package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into schoolData values(101,'sspucw','tumkur',9865438455),(102,'ssbehs','mysore',8764232526),(103,'reva','banglore',7645242268),(104,'cmrit','rajajinagar',6530981342),(105,'maruthi','tumkur',983562453)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
