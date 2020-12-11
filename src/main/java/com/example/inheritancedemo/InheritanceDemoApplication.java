package com.example.inheritancedemo;

import com.example.inheritancedemo.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceDemoApplication implements CommandLineRunner {
    private final VetService vetService;

    public InheritanceDemoApplication(VetService vetService) {
        this.vetService = vetService;
    }

    public static void main(String[] args) {
        SpringApplication.run(InheritanceDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        vetService.createDb();
    }
}
