package com.kazantsev.controllers;

import com.kazantsev.entities.Cat;
import com.kazantsev.repos.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AddController {
    @Autowired
    CatRepository catRepository;

    @GetMapping("/add")
    public  String add(){
        return "add";
    }

    @PostMapping("/add")
    public String addCat(Model model, @RequestParam String name, @RequestParam String type){
        Cat cat=new Cat();
        cat.setName(name);
        cat.setType(type);
        catRepository.save(cat);
        model.addAttribute("info", "cat adds");

        return "start";
    }

    @GetMapping("/view")
    public  String view(Model model){
        List<Cat> list= catRepository.findAll();
        model.addAttribute("list",list);
        return  "view";
    }
}
