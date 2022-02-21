package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "Welcome Admin, This is our home page";
    }

    @GetMapping("/login")
    @ResponseBody
    public String login() {
        return "Welcome Admin, This is our login page";
    }

    @GetMapping("/register")
    @ResponseBody
    public String register() {
        return "Welcome Admin, This is our register page";
    }

}
