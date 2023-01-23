package com.example.photography.controller;

import com.example.photography.model.PhotoGrapher;
import com.example.photography.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("photographer",new PhotoGrapher("","",""));
        return "index";
    }

    @GetMapping("/listPhotographers")
    public String listPhotographers(Model model){
        model.addAttribute("photographers", homeService.getPhotographers());
        return "listPhotographers";
    }

    @PostMapping("/savePhotographer")
    public String listPhotographers(Model model, @ModelAttribute PhotoGrapher photographer){
        model.addAttribute("photographers", homeService.savePhotographer(photographer));
        return "listPhotographers";
    }
}
