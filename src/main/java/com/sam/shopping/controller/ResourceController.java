package com.sam.shopping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @Value("${env}")
    String env;
    @GetMapping
    public String ping(){
        return "Application is up in "+env;
    }
}
