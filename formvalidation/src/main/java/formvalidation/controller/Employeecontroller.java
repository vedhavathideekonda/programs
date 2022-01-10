package formvalidation.controller;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import formvalidation.model.Employee;



@Controller
public class Employeecontroller {
 @RequestMapping(value = "/home", method = RequestMethod.GET)
 public String showHome() {  
 return "home";
 }
 
 @RequestMapping(value = "/registeremployee", method = RequestMethod.GET)
 public String registerUser(Model model) { 
  model.addAttribute(new Employee());
  return "employeeregister";
 }
 
 @RequestMapping(value = "/showemployee", method = RequestMethod.POST)
 public String showUser(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, Model model) { 
  if(result.hasErrors()) {
   return "registered";
  }
  model.addAttribute("Employee", employee);
  return "employee";
 }
}