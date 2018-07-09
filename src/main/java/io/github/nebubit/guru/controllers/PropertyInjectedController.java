package io.github.nebubit.guru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import io.github.nebubit.guru.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
    @Autowired
    private GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}