package com.director.repo.bootstrap;

import com.director.repo.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionalOnSystemPropertyBootstrap {


    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "default")
    public String helloWorld(){
        return "hello , default";

    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context=new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String HelloWorld=context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean : " + HelloWorld);

        // 关闭上下文
        context.close();

    }
}
