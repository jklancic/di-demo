package xyz.blackmonster.controllers;

import org.springframework.stereotype.Controller;

import xyz.blackmonster.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayGreeting();
	}
}
