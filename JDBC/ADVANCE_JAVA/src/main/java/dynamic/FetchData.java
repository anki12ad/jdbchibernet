package dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchData {
public static void main(String[] args) throws SQLException {
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("select * from empData where emp_Id=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter emp id");
	int id=sc.nextInt();
	preparedStatement.setInt(1, id);
	ResultSet resultSet=preparedStatement.executeQuery();
	resultSet.next();
	System.out.println("emp_Id :"+resultSet.getInt(1)+"emp_Name :"+resultSet.getString(2)+"emp_sal :"+resultSet.getInt(3)+"emp_email :"+resultSet.getString(4)+"emp_phone :"+resultSet.getLong(5));
	connection.close();
}
}
