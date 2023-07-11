package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsertion {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "root");
	Statement statement=connection.createStatement();
	statement.executeUpdate("insert into BankData values()");
	connection.close();
	System.out.println("inserted");
	
}
}
