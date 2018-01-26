package xyz.blackmonster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import xyz.blackmonster.services.GreetingService;

/**
 * Created by jt on 5/23/17.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    public MyController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}
