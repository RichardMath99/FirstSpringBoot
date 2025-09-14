package com.rich.first_spring_app.controller;

import com.rich.first_spring_app.domain.User;
import com.rich.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping()
    public String helloWorld() {
        return helloWorldService.helloWorld("Richard");
    }

    @PostMapping("/{id}")
    public String postHelloWorld(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "none") String filter, @RequestBody User body) {
        return "Hello World " + filter;
    }
}
