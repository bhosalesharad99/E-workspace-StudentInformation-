package serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Service;

import service.InsertRecordService;

@Service
public class InsertRecordServiceImpl implements InsertRecordService{

	@Override
	public void save(String StudentName,String Address,String MobileNo) {
		try
	    {
	      // create a mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/student";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "root");

	      // the mysql insert statement
	      String query = " insert into studentInformation (studentname, address, mobileno)"
	        + " values (?, ?, ?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      //preparedStmt.setInt(1, 2);
	      preparedStmt.setString (1, StudentName);
	      preparedStmt.setString (2, Address);
	      preparedStmt.setString (3, MobileNo);

	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	    	e.printStackTrace();
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		
	}

}
