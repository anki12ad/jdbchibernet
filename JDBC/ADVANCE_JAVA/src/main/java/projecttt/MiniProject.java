package projecttt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MiniProject {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		while(true)
		{
			System.out.println("select options \n 1: insert \n 2: update \n 3: fetch \n 4: delete");
			
			switch(sc.nextInt())
			{
			case 1:{
				PreparedStatement preparedStatement=connection.prepareStatement("insert into empData values(?,?,?,?,?)");
				System.out.println("enter emp id");
				int id=sc.nextInt();
				System.out.println("enter emp name");
				String name=sc.next();
				System.out.println("enter emp sal");
				int sal=sc.nextInt();
				System.out.println("enter  emp email");
				String email=sc.next();
				System.out.println("enter emp phone");
				Long phone =sc.nextLong();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setInt(3, sal);
				preparedStatement.setString(4, email);
				preparedStatement.setLong(5, phone);
				preparedStatement.executeUpdate();
				System.out.println("Data inserted");
				break;
					}
			case 2:{
				System.out.println("select option 1 :name \n 2: email \n 3: sal");
				switch(sc.nextInt()){
				case 1:{
					PreparedStatement preparedStatement=connection.prepareStatement("update empData set emp_Name=? where emp_Id=?");
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter id");
					int id=sc.nextInt();
					preparedStatement.setString(1, name);
					preparedStatement.setInt(2, id);
					preparedStatement.executeUpdate();
					System.out.println("data updated");
					break;
				}
				case 2:{
					PreparedStatement preparedStatement=connection.prepareStatement("update empData set emp_Email=? where emp_Id=?");
					System.out.println("enter email");
					String email=sc.next();
					System.out.println("enter id");
					int id=sc.nextInt();
					preparedStatement.setString(1, email);
					preparedStatement.setInt(2, id);
					preparedStatement.executeUpdate();
					System.out.println("email updated");
					break;
				}
				case 3:{
					PreparedStatement preparedStatement=connection.prepareStatement("update empData set emp_Sal=? where emp_Id=?");
					System.out.println("enter id");
					int id=sc.nextInt();
					System.out.println("enter sal");
					int sal=sc.nextInt();
					preparedStatement.setInt(1, id);
					preparedStatement.setInt(2, sal);
					preparedStatement.executeUpdate();
					System.out.println("sal updated");
					break;
				}
				}
				
				break;
			}
			case 3:{
				PreparedStatement preparedStatement=connection.prepareStatement("select * from empData where emp_Id=?");
				System.out.println("enter emp id");
				int id=sc.nextInt();
				preparedStatement.setInt(1, id);
				ResultSet resultSet=preparedStatement.executeQuery();
				resultSet.next();
				System.out.println("emp_Id :"+resultSet.getInt(1)+"emp_Name :"+resultSet.getString(2)+"emp_sal :"+resultSet.getInt(3)+"emp_email :"+resultSet.getString(4)+"emp_phone :"+resultSet.getLong(5));
				System.out.println("record fetch");
				break;
			}
			case 4:{
				System.out.println("Select option 1:id \n 2:name \n 3:emai");
				switch(sc.nextInt()){
				case 1:{
					PreparedStatement preparedStatement=connection.prepareStatement("Delete from empData where emp_Id=?");
					System.out.println("enter emp id");
					int id=sc.nextInt();
					System.out.println("record  one deleted");
					preparedStatement.setInt(1, id);
					preparedStatement.executeUpdate();
					break;
				}
				case 2:{
					PreparedStatement preparedStatement=connection.prepareStatement("Delete from empData where emp_Name=?");
					System.out.println("enter emp name");
					String name=sc.next();
					System.out.println("record  one deleted");
					preparedStatement.setString(1, name);
					preparedStatement.executeUpdate();
					
					break;
				}
				
				case 3:{
					PreparedStatement preparedStatement=connection.prepareStatement("Delete from empData where emp_Email=?");
					System.out.println("enter emp email");
					String email=sc.next();
					System.out.println("record  one deleted");
					preparedStatement.setString(1, email);
					preparedStatement.executeUpdate();
					break;
				}
				
			}
				break;
			}
			default :{
				System.out.println("All operations Done......");
				 
			}
			}
		}
	}
		
}
