package com.learn.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/greet")
    public String greet(){
        return "hello boi";
    }
    @RequestMapping("/home")
    public String home(){
        return "Welcome to home page";
    }

}
