package serviceImpl;

import java.sql.PreparedStatement;

import org.springframework.stereotype.Service;

import connection.Connectivity;
import service.DeleteRecordService;
@Service
public class DeleteRecordServiceImpl implements DeleteRecordService {

	@Override
	public void delete(Integer Studentid) {

		
		try
	    {
			
			Connectivity jdbcobj= new Connectivity();
	      // create a mysql database connection
	     /* String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/student";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
*/
	      // the mysql insert statement
	      String query = "delete from studentinformation where studentid="+Studentid+"";

	      // create the mysql insert preparedstatement
	      /*Connection conn=null;
	      conn=jdbcobj.Connection();
	      PreparedStatement preparedStmt = conn.prepareStatement(query);*/
	      
	      
	    
	      PreparedStatement preparedStmt = jdbcobj.Connection().prepareStatement(query);
	      
	      
	      
	      //preparedStmt.setInt(1, 2);
	    /* preparedStmt.setInt(1, StudentId);
	      preparedStmt.setString (2, StudentName);*/
	      

	      // execute the preparedstatement
	      preparedStmt.executeUpdate();
	      
	      jdbcobj.Connection().close();
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		
		
	}
	
	
	

	

}
