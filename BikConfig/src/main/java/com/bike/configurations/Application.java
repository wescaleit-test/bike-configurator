package com.bike.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.bike.configurations.controller"})
@ComponentScan("com.bike.configurations.repository")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application {
/*
 * Starting Application Class
 */
    public static void main(String[] args) {
    	System.out.println("Server Starting");
        SpringApplication.run(Application.class, args);
    }
}