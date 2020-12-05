package com.emse.spring.faircorpagain.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {

    @RequestMapping("/homeJsp")
    public String home(){
        return "home.jsp";
    }
}
