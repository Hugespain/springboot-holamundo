package com.example.demo.controllers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    String name;
    String email;
}
