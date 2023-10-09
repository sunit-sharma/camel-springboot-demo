package com.example.springboot.camel.camelspringbootdemo;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelDemoRestController {

    @Autowired
    ProducerTemplate producerTemplate;

    @GetMapping(value = "/")
    public String camelDemo(){
    producerTemplate.sendBody("direct:poc1", "calling from Spring Boot REST controller");
        return "Hello World";

    }
    
}
