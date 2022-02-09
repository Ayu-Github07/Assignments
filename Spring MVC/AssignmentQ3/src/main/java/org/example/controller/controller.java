package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("username")String username, @RequestParam("password")String password){
        UserModel userModel = new UserModel();
        userModel.setEmail("agrawal_ayush.cs@ghrce.raisoni.net");
        userModel.setUsername("ConiferousClone");
        userModel.setPassword("Darkayush@123");

        if(username.equals(userModel.getUsername()) && password.equals(userModel.getPassword())){
            ModelAndView modelAndView =  new ModelAndView("success");
            modelAndView.addObject("user",userModel);
            return modelAndView;

        }
        else {
            return new ModelAndView("error");
        }
    }
}
