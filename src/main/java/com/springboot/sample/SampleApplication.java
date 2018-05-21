package com.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args);
    }
}
