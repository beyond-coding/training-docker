package com.beyondcoding.dockerwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerwebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerwebappApplication.class, args);
    }

    @GetMapping
    String message() {
        return "LET'S LEARN DOCKER";
    }
}
