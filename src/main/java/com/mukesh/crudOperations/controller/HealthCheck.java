package com.mukesh.crudOperations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/abc")
    public String healthCheck() {

        return "ok";

    }
}
