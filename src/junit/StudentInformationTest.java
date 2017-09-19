package junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.mysql.jdbc.PreparedStatement;

public class StudentInformationTest {
	
	
	public StudentInformationTest() {
		// TODO Auto-generated constructor stub
		
	}
	
	String connectionUrl = "jdbc:mysql://localhost:3306/student";
    String dbUser = "root";
    String dbPwd = "root";
    Connection conn;
    ResultSet rs;
    
  
	
	@Test
	public void test(){
		
		  try {
			conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
			Statement stmt = conn.createStatement();
			
			String query = " insert into studentInformation (studentid, studentname, address, mobileno)"
			        + " values (?, ?, ?, ?)";

			      // create the mysql insert preparedstatement
			      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			      preparedStmt.setInt(1, 1);
			      preparedStmt.setString (2, "Rubble");
			      preparedStmt.setString   (3, "abc");
			      preparedStmt.setString(4, "1111");
			      preparedStmt.execute();
			      
			      conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		  if (conn != null)
	      {
	        try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	      }
		
	}

}
