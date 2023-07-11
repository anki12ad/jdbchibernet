package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "root");
		System.out.println("connection establish");
		Statement statement= connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter table name");
		String tbname=sc.next();
		System.out.println("ENTER COLUMNS");
		String id=sc.next();
//		String name=sc.next();
//		String email=sc.next();
//		statement.execute("create table empData(emp_Id int primary key,emp_name varchar(30),emp_sal int not null,emp_Email varchar(20) unique,emp_Phone bigInt unique)");
		
		statement.execute("create table "+tbname+"("+id+" int primary key)");
		System.out.println("DataBase created Successfully");
		connection.close();

	}


}
