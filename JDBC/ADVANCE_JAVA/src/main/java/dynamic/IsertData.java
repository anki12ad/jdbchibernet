package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IsertData {
public static void main(String[] args) throws SQLException {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into empData values(?,?,?,?,?)");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("enter EMP Id");
	int id=sc.nextInt();
	
	System.out.println("enter EMP Name");
	String name=sc.next();
	
	System.out.println("enter EMP Sal");
	int sal=sc.nextInt();
	
	System.out.println("enter EMP Email");
	String email=sc.next();
	
	System.out.println("enter EMP Phone");
	Long Phone=sc.nextLong();
	
	preparedStatement.setInt(1, id);
	preparedStatement.setString(2, name);
	preparedStatement.setInt(3, sal);
	preparedStatement.setString(4, email);
	preparedStatement.setLong(5, Phone);
	
	preparedStatement.execute();
	
	System.out.println("Data Inserted");
}
}
