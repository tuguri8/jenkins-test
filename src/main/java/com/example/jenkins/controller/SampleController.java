package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/test")
public class SampleController {

    @GetMapping
    public String sample() {
        return "sample";
    }
}
