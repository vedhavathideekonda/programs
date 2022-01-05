package controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class AddController {
	@RequestMapping("/add")
public ModelAndView add(HttpServletRequest request) {
	int i = Integer.parseInt(request.getParameter("i1"));
	int j = Integer.parseInt(request.getParameter("i2"));
	int n = i + j;
	ModelAndView m = new ModelAndView();
	m.setViewName("display.jsp");
	m.addObject("result",n);
	return m;
	
}
}