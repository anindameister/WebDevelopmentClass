package com.emse.spring.faircorp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


//    @ResponseBody
@RequestMapping("/welcome.html")
    public ModelAndView home(){
        System.out.println("hi");
    return new ModelAndView("welcome");
//        return "home.jsp";

    }
}
