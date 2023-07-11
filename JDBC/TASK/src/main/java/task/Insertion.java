package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/XYZ", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("insert into ABCData values(1,'sagar','T','CS','BE','sagar2@gmail.com',9865438455,'Rajajinar','Banglore','Karnataka',532467),(2,'savitha','S','BE','CS','savitha2@gmail.com',98646238455,'JpNagar','Banglore','Karnataka',5361267),(3,'vini','T','BE','CS','vini92@gmail.com',9865407255,'SSpuram','Tumkur','Karnataka',536767),(4,'Pavan','u','BE','civil','Pavanr42@gmail.com',9865438485,'Mallasandra','mysore','Karnataka',532067),(5,'karthik','M','CS','BCA','karthikm2@gmail.com',9865438454,'Sampige','Mysore','Karnataka',525467),(6,'Manju','T','BE','mech','manja42@gmail.com',98234438455,'KuvempuRoad','Banglore','Karnataka',452467),(7,'manoj','T','science','Bsc','manoj342@gmail.com',94567438455,'MGroadr','Tumkur','Karnataka',532467),(8,'nithin','S','BE','mech','nithin342@gmail.com',9865438125,'Dabaspete','BangloreRu ','Karnataka',532469),(9,'ganesh','T','BE','civil','ganesh34@gmail.com',9865434655,'Rajajinar','Banglore','Karnataka',532467),(10,'Lochu','L','BE','mech','lochi72@gmail.com',98764438455,'SIT','Tumkur','Karnataka',532460)");
		System.out.println("Insert the values Successfully");
		connection.close();
	}
}
