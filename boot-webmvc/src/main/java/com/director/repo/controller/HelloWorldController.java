package com.director.repo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //http://localhost:8080/?value=1
    @RequestMapping("")
    public String index(@RequestParam int value, Model model) {
//        model.addAttribute("acceptLanguage",acceptLanguage);
//        model.addAttribute("jsessionId",jsessionId);
//        model.addAttribute("message","Hello,World");
        return "index";
    }

}
