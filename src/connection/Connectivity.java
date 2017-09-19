package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {
	
	public Connectivity() {
		
		/*String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/student";
		String user = "root";
		String password = "root";
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		// TODO Auto-generated constructor stub
*/		
		 String connectionUrl = "jdbc:mysql://localhost:3306/student";
		    String dbUser = "root";
		    String dbPwd = "root";
		    Connection conn;
		    ResultSet rs;
		    
		    try {
				conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
				Statement stmt = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
	}
	
	

}
