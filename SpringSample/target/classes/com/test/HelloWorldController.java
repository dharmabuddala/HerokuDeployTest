package com.test;

@Controller
public class HelloWorldController {
	 @RequestMapping("/hello")  
	    public ModelAndView helloWorld() {  
	        String message = "HELLO SPRING MVC HOW R U";  
	        return new ModelAndView("hellopage", "message", message);  

}
