package zrq.com.sfgdi.controllers;

import org.springframework.stereotype.Component;
import zrq.com.sfgdi.services.GreetingService;

@Component
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
