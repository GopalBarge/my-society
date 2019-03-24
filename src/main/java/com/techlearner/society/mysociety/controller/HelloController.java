package com.techlearner.society.mysociety.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/")
public class HelloController {
    @GetMapping
    public String getHello() {
        return "Hello from my society rest end point";
    }

    @PostMapping
    public String postHello() {
        return "post request accepted by rest end point";
    }

    @PutMapping
    public String putHello() {
        return "put request accepted by rest end point";
    }

    @DeleteMapping
    public String deleteHello() {
        return "delete request accepted by rest end point";
    }
}
