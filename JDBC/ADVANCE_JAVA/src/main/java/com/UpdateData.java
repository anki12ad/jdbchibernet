package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	Statement statement=connection.createStatement();
	statement.execute("update empData set emp_Sal=85000 where emp_Id=104");
	statement.execute("update empData set emp_Email='lochi18@gmail.com' where emp_Id=102");
	statement.execute("update empData set emp_Name='Bhumi',emp_Sal=20000 where emp_Id=103");
	System.out.println(statement.executeUpdate("update empData set emp_Sal=85000 where emp_Id=104"));
	System.out.println(statement.executeUpdate("update empData set emp_sal=4000 where emp_Id=1001"));
	connection.close();
}
}
