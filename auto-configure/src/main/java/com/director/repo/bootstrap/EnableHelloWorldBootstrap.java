package com.director.repo.bootstrap;


import com.director.repo.annotation.EnableHelloWorld;
import com.director.repo.annotation.HelloWorldImportSelector;
import com.director.repo.configuration.CommonConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.stream.Stream;

//@ComponentScan(basePackageClasses = {CommonConfiguration.class})
//@EnableAutoConfiguration
@EnableHelloWorld
//@Import(HelloWorldConfiguration.class)
//@Import(HelloWorldImportSelector.class)
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);

        //simpleBean 是否存在


        String simpleBean=context.getBean("simpleBean",String.class);

        System.out.println("simple bean : "+simpleBean);
    }



}
