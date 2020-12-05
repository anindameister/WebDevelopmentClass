//package com.emse.spring.faircorpagain.hello;
//
//import com.emse.spring.faircorpagain.hello.ConsoleGreetingService;
//import com.emse.spring.faircorpagain.hello.GreetingService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.test.system.CapturedOutput;
//import org.springframework.boot.test.system.OutputCaptureExtension;
//
// class GreetingServiceTest {
//    @Test
//    public void testGreeting(CapturedOutput output) {
//        GreetingService greetingService = new ConsoleGreetingService(); // (2)
//        greetingService.greet("Spring");
//        Assertions.assertThat(output.getAll()).contains("Spring");
//    }
//}
