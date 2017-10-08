package allcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import entity.StudentInfoEntity;
import service.DeleteRecordService;

@Controller
public class DeleteRecordController {
	
	@Autowired
	private DeleteRecordService deleterecordService;
	
	
	 @RequestMapping(value="/DeleteRecord")  
	    public ModelAndView deleteData(){ 
		 
		  return new ModelAndView("DeleteRecord","command",new StudentInfoEntity());  
		  
	  
	  }
	  
	  
	  @RequestMapping(value="/deletexyz",method = RequestMethod.POST)  
	    public ModelAndView deleteData(@RequestParam Integer StudentId){ 
		  
		 
	        
		  deleterecordService.delete(StudentId);
	       
	       
	        return new ModelAndView("redirect:/DeleteRecord");//will redirect to Home.jsp request mapping  
	    }
	  
	
	

}
