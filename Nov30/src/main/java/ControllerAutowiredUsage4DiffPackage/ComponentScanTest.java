package ControllerAutowiredUsage4DiffPackage;


import org.springframework.stereotype.Component;

@Component
public class ComponentScanTest {

    public void hello(){
        System.out.println("Hello World");
    }

    public String babySays(){
        return "Hello World,here I come";
    }
}
