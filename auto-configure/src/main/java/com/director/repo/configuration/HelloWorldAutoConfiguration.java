package com.director.repo.configuration;


import com.director.repo.annotation.EnableHelloWorld;
import com.director.repo.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

//@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "vincent") // 条件装配
public class HelloWorldAutoConfiguration {

}


