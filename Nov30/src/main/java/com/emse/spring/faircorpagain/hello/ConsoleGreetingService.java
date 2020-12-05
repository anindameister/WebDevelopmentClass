package com.emse.spring.faircorpagain.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingService implements GreetingService{
    @Override
    public void greet(String name) {
        System.out.println(name);
    }
}


