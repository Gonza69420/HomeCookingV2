package com.homecooking.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginFront {

    @GetMapping("/login")
    public String index() {
        return "Welcome to HomeCooking";
    }

}