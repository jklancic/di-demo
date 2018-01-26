package xyz.blackmonster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import xyz.blackmonster.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
