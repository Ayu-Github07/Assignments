package com.example.assignment2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/signin")
    public String login() {
        return "login.html";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String hellWorld() {
        return "Hello World!!";
    }
}
