package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("update schoolData set sch_phone=636725619 where sch_Id=104");
		statement.execute("update schoolData set sch_Name='Kids' where sch_Id=101");
		connection.close();
	}
}
