package com.kazantsev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String start(Model model){
        model.addAttribute("info","You Enter");
        return  "index";
    }

    @GetMapping("/home")
    public  String home(){
        return "home";
    }





}
