package com.example.spring.controller;

import com.example.spring.model.dto.StudentDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    // API
    @GetMapping("student/{name}/{age}")
    public String welcomeWithPathVariableApi(@PathVariable String name, @PathVariable Integer age) {
        String welcomeMessage = "<h1>Welcome " + name + "!!, age = " + age + "</h1>";
        return welcomeMessage;
    }

    @GetMapping("student")
    public String welcomeWithBodyApi(@RequestBody StudentDto studentDto) {
        String welcomeMessage = "<h1>Welcome " + studentDto.getName() + "!!, age = " + studentDto.getAge() + "</h1>";
        return welcomeMessage;
    }
}
