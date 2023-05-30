package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/")
    public void getMapping() {
        System.out.println("getMapping");
    }

    @GetMapping("/hello")
    public String helloPage(){
        return "templates/hello";

    }

    @GetMapping("/goodbye")
    public String goodBye(){
        return "templates/goodbye";
    }

    @GetMapping("/exit")
    public String exit(){
        return "templates/exit";
    }
}
