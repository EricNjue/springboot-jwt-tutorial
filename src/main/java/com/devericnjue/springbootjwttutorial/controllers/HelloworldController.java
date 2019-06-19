package com.devericnjue.springbootjwttutorial.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloworldController {

    @GetMapping
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Hello World");
    }
}
