package com.sam.shopping.controller;

import com.sam.shopping.UserRepository;
import com.sam.shopping.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @Value("${env}")
    String env;
    @Autowired
    UserRepository repository;
    @GetMapping
    public String ping(){
        return "Application is up in "+env;
    }
    @PutMapping("/user")
    public String storeUser(@RequestBody User user){
       // repository.save()
        try{
repository.save(user);
           // repository.save(new User("1","dk2547",env));
            return "Success";
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "failed";
    }
}
