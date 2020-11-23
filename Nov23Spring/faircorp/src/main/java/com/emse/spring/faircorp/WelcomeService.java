package com.emse.spring.faircorp;

public class WelcomeService {

    public void sayHello() {
        NameService nameService = new NameService();
        System.out.println("Hello " + nameService.getName());
    }
}
