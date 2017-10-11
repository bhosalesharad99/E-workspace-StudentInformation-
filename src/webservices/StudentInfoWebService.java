package webservices;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entity.StudentInfoEntity;


@Path("/json/metallica")
public class StudentInfoWebService {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<StudentInfoEntity> getTrackInJSON() {
		
		
		ArrayList<StudentInfoEntity> courseList = new ArrayList<StudentInfoEntity>();
		try
		{
			/*GetInformationImpli impli= new GetInformationImpli();
			impli.getData();
			courseList=impli.getData();*/
			
		courseList = new GetInformationImpli().getData();
	
		} catch (Exception e)
		{
		e.printStackTrace();
		}
		return courseList;

	}

	/*@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}*/


}