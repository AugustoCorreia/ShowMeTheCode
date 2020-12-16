package com.falemais.ShowMeTheCode.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class init {
    @CrossOrigin
    @GetMapping("/on")
    public String on(){
        return"ONLINE!";
    }
}
