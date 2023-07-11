package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle1", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into vehData values(101,'Yamaha','2wheller',9865438),(102,'Innova','4wheller',87642526),(103,'BMW','4wheller',76452268),(104,'Activa','2wheller',65301342),(105,'Dio','tumkur',9832453)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
