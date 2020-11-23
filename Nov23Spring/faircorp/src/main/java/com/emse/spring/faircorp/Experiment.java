package com.emse.spring.faircorp;

public class Experiment {

    public class B {
        public String name() {
            return "Guillaume";
        }
    }

    public class A {
        public void hello() {
            B b = new B();
            System.out.println("Hello " + b.name());
        }
    }
}
