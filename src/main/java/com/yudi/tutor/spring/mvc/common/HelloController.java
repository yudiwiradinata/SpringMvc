package com.yudi.tutor.spring.mvc.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	
	
	@RequestMapping(value="/welcome",method = RequestMethod.GET)
	public ModelMap printWelcome(ModelMap model) {
		// TODO Auto-generated method stub
		return model.addAttribute("message","Spring 3 MVC Hello World");
		//return"welcome";
	}
	
	@RequestMapping(value="/{name}",method = RequestMethod.GET)
	public String getDefaultMovie(@PathVariable String name, ModelMap model){		
		model.addAttribute("movie", "Ini "+name);
		return "movie";
	}
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model){		
		model.addAttribute("movie", "this is default movie");
		return "movie";
	}
}
