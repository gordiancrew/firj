package com.kazantsev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String start(){
        return  "start";
    }

    @GetMapping("home")
    public  String home(){
        return "home";
    }
}
