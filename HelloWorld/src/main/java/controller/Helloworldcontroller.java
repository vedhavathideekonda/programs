package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Helloworldcontroller {
	@RequestMapping("/index")
	public ModelAndView add(HttpServletRequest request) {
		ModelAndView m = new ModelAndView();
		m.setViewName("helloworld.jsp");
		return m;
		
	}

}
