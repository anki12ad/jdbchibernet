package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteParticularData {
	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from empData where emp_Id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp id");
		int id=sc.nextInt();
		System.out.println("record deleted");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		connection.close();
	}
	
}
