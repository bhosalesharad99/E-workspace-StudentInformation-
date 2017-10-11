package webservices;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Connectivity;
import entity.StudentInfoEntity;

public class GetInformationImpli {

	
	public ArrayList<StudentInfoEntity> getData() throws ClassNotFoundException, SQLException {
		Connectivity jdbcobj= new Connectivity();
		ArrayList<StudentInfoEntity> courseList = new ArrayList<StudentInfoEntity>();
		PreparedStatement stmt = jdbcobj.Connection().prepareStatement("SELECT * FROM studentinformation");
		ResultSet rs = stmt.executeQuery();
		try
		{
		while(rs.next())
		{
			StudentInfoEntity courseObj = new StudentInfoEntity();
		courseObj.setStudentId(rs.getInt("studentid"));
		courseObj.setStudentName(rs.getString("studentname"));
		courseObj.setAddress(rs.getString("address"));
		courseObj.setMobileNo(rs.getString("mobileno"));
		courseList.add(courseObj);
		}
		} catch (SQLException e)
		{
		e.printStackTrace();
		}
		return courseList;
		

		
	}

}
