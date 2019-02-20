package com.bike.configurations.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {
/*
 * Starting Application Class
 */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}