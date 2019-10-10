package com.cg.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//this class can handle multiple requests
@Controller
public class GreetingController {
	
	@RequestMapping("/greet.do")
	public String sayHello(Map<String, String> model) {
		model.put("message", "Welcome to improved MVC");
		return "greeting";
	}
	
	@RequestMapping("/bye.do")
	public String sayGoodBye(Map<String, String> bbye) {
		bbye.put("message", "BBye! Have a nice day!");
		return "greeting";
	}
}
