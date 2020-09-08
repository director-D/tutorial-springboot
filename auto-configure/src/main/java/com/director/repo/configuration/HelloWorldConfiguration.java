package com.director.repo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration 这个 Configuration 注解不是必须的
public class HelloWorldConfiguration {

    @Bean
    public String simpleBean(){
        return "it`s a string ";
    }


}
