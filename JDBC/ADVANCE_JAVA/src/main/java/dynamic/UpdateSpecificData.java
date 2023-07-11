package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateSpecificData {
public static void main(String[] args) throws SQLException {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	PreparedStatement preparedStatement=connection.prepareStatement("update empData set emp_Name=?,emp_Email=? where emp_Id=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String name=sc.next();
	System.out.println("enter email");
	String email=sc.next();
	System.out.println("enter id");
	int id=sc.nextInt();
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, email);
	preparedStatement.setInt(3, id);
	preparedStatement.execute();
	System.out.println("data updated");
	
}
}
