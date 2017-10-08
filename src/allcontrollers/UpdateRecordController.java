package allcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import entity.StudentInfoEntity;
import service.UpdateRecordService;

@Controller
public class UpdateRecordController {
	
	
	@Autowired
	private UpdateRecordService updateService;
	
	
	
	 @RequestMapping(value="/UpdateRecord")  
	    public ModelAndView changeData(){ 
		 
		  return new ModelAndView("UpdateRecord","command",new StudentInfoEntity());  
		  
	  
	  }
	  
	  
	  @RequestMapping(value="/updatexyz",method = RequestMethod.POST)  
	    public ModelAndView changeData(@RequestParam Integer StudentId,
	    		@RequestParam String StudentName){ 
		  
		 
	        
		  updateService.change(StudentId,StudentName);
	       
	       
	        return new ModelAndView("redirect:/UpdateRecord");//will redirect to Home.jsp request mapping  
	    }
	
	

}
