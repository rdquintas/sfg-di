package zrq.com.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zrq.com.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}