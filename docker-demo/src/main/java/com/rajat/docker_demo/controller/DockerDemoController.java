package com.rajat.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
    @GetMapping("/dockerdemo")
    public String getDemo()
    {
        return "Spring Boot App is Dockerised successfully";
    }
}
