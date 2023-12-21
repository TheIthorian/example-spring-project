package com.theithorian.exampleproject.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthRestController {

    @GetMapping("/")
    public String getHealth() {
        return "ok";
    }
}
