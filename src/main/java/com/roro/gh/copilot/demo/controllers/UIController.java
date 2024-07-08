package com.roro.gh.copilot.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ui")
public class UIController {

    @GetMapping("/home")
    public String viewIndex(Model model) {
        return "index";
    }
}
