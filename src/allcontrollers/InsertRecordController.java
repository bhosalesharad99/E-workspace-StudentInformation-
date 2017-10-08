package allcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import entity.StudentInfoEntity;
import service.InsertRecordService;

@Controller
public class InsertRecordController{

	@Autowired
	private InsertRecordService insertService;
	
	
	@RequestMapping("/InsertRecord")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("InsertRecord","command",new StudentInfoEntity());  
    }  
	
	
	
	  @RequestMapping(value="/savexyz",method = RequestMethod.POST)  
	    public ModelAndView insertData(@RequestParam String StudentName,
	    		@RequestParam String Address,@RequestParam String MobileNo){ 
		  
		   // System.out.println("Data Recieved in Controller" +StudentId);
		    System.out.println("Data Recieved in Controller" +StudentName);
		    System.out.println("Data Recieved in Controller" +Address);
	        System.out.println("Data Recieved in Controller" +MobileNo);  
	        
	        insertService.save(StudentName,Address,MobileNo);
	       
	        
	        return new ModelAndView("redirect:/InsertRecord");//will redirect to Home.jsp request mapping  
	    }	  
	 
	  
}