package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
        // case "firefox"
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        SpringApplication.run(SecurityApplication.class, args);
    }

}
