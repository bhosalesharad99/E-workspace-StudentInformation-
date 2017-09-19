package connection;

import java.sql.DriverManager;

public class Connectivity {
	
	public Connectivity() {
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/student";
		String user = "root";
		String password = "root";
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		// TODO Auto-generated constructor stub
	}
	
	

}
