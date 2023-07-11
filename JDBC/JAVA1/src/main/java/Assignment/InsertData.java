package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into studentData values(101,'Ravish','anki3423',9865438455),(102,'Nagaraju','lochu435',8764232526),(103,'viji','pinnu453',7645242268),(104,'raju','Bhumi1345',568324906),(105,'vini','ranju239',85342109745)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
