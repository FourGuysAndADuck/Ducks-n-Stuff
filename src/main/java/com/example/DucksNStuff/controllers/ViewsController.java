package com.example.DucksNStuff.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class ViewsController {

    //TODO:Get with Darien and add routes on backend.
    @RequestMapping({"/", "signup", "/login", "/title,", "/about", "/help", "/cart"})
    public String showView() {
        return "forward:/index.html";
    }
}
