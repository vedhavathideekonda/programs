package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllerclass {
@RequestMapping(value="/form",method=RequestMethod.GET)
public ModelAndView view(HttpServletRequest request) {
	ModelAndView m = new ModelAndView();
	m.setViewName("form.jsp");
	return m;
	}
@RequestMapping(value="/submitform",method=RequestMethod.POST)
public ModelAndView submitForm(@ModelAttribute(value="modeltails1") modeldetails modeldetails1){
	{
	ModelAndView mv = new ModelAndView("formsuccess");
	mv.addObject("headermessage","userdetails from submitted");
	mv.addObject("modeldetails1",modeldetails1);
	return mv;
	
}
}
}
