package com.emse.spring.faircorpagain.learningFromOutside;

import ControllerAutowiredUsage4DiffPackage.ComponentScanTest;
import com.emse.spring.faircorpagain.learningFromOutside.NewBornBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewBornBabyController {

    @Value("${baby.weight:we didn't get the value from application.properties}")
            String babyweight;

//    @Autowired
    NewBornBabyService newBornBabyService=new NewBornBabyService();

    @Autowired
    ComponentScanTest componentScanTest;

    @GetMapping("baby/name")
    public String putBabyName(){

        return "The baby name is "+newBornBabyService.getBabyName() +". "+"The baby weight is "+babyweight+"The baby says "+componentScanTest.babySays() ;
    }

    @GetMapping("baby")
    public String getBaby(){

        componentScanTest.hello();
        return newBornBabyService.getBabyName();

    }
}
