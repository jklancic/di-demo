package xyz.blackmonster.controllers;

import xyz.blackmonster.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
