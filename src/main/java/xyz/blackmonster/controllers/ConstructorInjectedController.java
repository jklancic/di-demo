package xyz.blackmonster.controllers;

import xyz.blackmonster.services.GreetingService;

public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
