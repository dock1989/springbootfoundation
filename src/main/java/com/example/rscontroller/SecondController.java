package com.example.rscontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping(value = "/check")
    public String check(){
        return "Working fine";
    }
}
