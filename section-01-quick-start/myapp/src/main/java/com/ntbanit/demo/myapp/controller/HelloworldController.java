package com.ntbanit.demo.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @Value("${coach.name}")
    String coachName;
    @Value("${coach.course}")
    String coachCourse;

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
