package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping(value = "say")		// method like doGet() and say is url pattern 
	@ResponseBody								// When you want to return string with @Controller annotation 
	public String sayHello() {
		return "Welcome to Spring boot with Controller";
	}
}
