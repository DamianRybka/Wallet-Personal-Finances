package com.wallet.personal_finances.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetController {

    @RequestMapping(value="/helloworld", method = RequestMethod.GET)
    public String sayHelloWold() {
        return "Hello World!";
    }
}
