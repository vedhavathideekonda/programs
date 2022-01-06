package controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class SimpleIntrestController {
	@RequestMapping("/add")
public ModelAndView add(HttpServletRequest request) {
	int i = Integer.parseInt(request.getParameter("i1"));
	int j = Integer.parseInt(request.getParameter("i2"));
	int k = Integer.parseInt(request.getParameter("i3"));
	int n = (i * j * k)/100;
	ModelAndView m = new ModelAndView();
	m.setViewName("display.jsp");
	m.addObject("result",n);
	return m;
	
}
}