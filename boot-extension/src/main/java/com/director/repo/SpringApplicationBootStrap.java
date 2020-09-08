package com.director.repo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

/**
 *  展示不同的引导方式
 */
public class SpringApplicationBootStrap {

    public static void main(String[] args) {

        Set<String> sources=new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication=new SpringApplication();
        springApplication.setSources(sources);
        springApplication.run(args);

    }


    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}
