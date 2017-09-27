package allcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import entity.RegistrationInformation;
import service.HomeService;

@Controller
public class HomeController{
	@Autowired(required=false)
	HomeService homeService;
	
	@RequestMapping("/Home")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        return new ModelAndView("Home","command",new RegistrationInformation());  
    }  
	
	  @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save( @RequestParam String FirstName){  
	        //write code to save emp object  
	        //here, we are displaying emp object to prove emp has data  
	        System.out.println(FirstName);
	        
	        homeService.save(FirstName);
	          
	        //return new ModelAndView("empform","command",emp);//will display object data  
	        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
	    } 
}