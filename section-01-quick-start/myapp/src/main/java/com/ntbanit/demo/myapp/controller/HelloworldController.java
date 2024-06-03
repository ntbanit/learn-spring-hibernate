package com.ntbanit.demo.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @Value("${coach.name}")
    private String coachName;
    @Value("${coach.course}")
    private String coachCourse;
    @Value("${my.name}")
    private String myName;
    @Value("${my.age}")
    private Integer myAge;
    @GetMapping("/my-info")
    public String getMyInfo() {
        return myName + " is " + myAge + " years old.";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/course")
    public String getCoachCourse() {
        return coachCourse;
    }
    @GetMapping("/name")
    public String getCoachName() {
        return coachName;
    }
    @GetMapping("/devtools")
    public String testDevTools() {
        return "is it work?";
    }
}
