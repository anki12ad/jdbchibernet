package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAllRecord {
	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from empData"); 
		preparedStatement.executeUpdate();
		System.out.println("Delete all records");
		connection.close();
}
}
