package com.sam.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping
    public String getResponce(){
        return "hello heroku - 1";
    }
}
