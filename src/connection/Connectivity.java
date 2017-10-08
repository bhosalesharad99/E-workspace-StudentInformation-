package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

		
			public  Connection Connection () throws ClassNotFoundException, SQLException{

				Class.forName("com.mysql.jdbc.Driver");
		
			Connection connection = null;

				connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/student","root", "root");

			
			return connection;
			}

}