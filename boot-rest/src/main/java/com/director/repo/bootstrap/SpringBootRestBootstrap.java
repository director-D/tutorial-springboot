package com.director.repo.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.director.repo.controller",
        "com.director.repo.config"
})
public class SpringBootRestBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }


}
