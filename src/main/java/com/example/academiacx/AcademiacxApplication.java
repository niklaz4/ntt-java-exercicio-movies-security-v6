package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcademiacxApplication {

    @Autowired
    private static FilmeRepository filmeRepository;

    public static void main(String[] args) {
        SpringApplication.run(AcademiacxApplication.class, args);

    }
}
