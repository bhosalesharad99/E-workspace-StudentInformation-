package allcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Home")
public class HomeController{

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView helloWorld(){

		ModelAndView model = new ModelAndView("Home");
		//model.addObject("msg", "hello world");

		return model;
	}
}