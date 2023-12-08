package com.daniel.java.back.end.userapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class UserController {

    @GetMapping("/")
    public String getMessage() {

        return "eses";
    }
    
    
}
