package com.msademo.microservice1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("api/ms1")
public class ProducerController {

    @GetMapping("demo")
    public String demo() {
        Random random = new Random();
        int r = random.nextInt(100);
        return "Your Lucky number is " + r + "!!";
    }
}
