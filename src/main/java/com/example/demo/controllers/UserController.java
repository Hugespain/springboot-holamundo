package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.dto.UserDTO;


@RestController
public class UserController {

    @GetMapping("/welcome")
    public UserDTO details() {
        return UserDTO.builder().name("John").email("John@welcome.com").build();
    }
}
