package com.example.springboot.camel.camelspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.springboot"})
public class CamelSpringbootDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CamelSpringbootDemoApplication.class, args);
    }


}
