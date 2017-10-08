package serviceImpl;

import java.sql.PreparedStatement;

import org.springframework.stereotype.Service;

import connection.Connectivity;

import service.UpdateRecordService;

@Service
public class UpdateRecordServiceImpl implements UpdateRecordService{
	

	@Override
	public void change(Integer StudentId,String StudentName) {
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
	      String query = "update studentinformation set studentname='"+StudentName+"' where studentid="+StudentId+"";

	      // create the mysql insert preparedstatement
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
