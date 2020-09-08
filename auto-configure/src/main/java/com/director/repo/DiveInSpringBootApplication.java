package com.director.repo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiveInSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("开始启动spring boot");
        SpringApplication springApplication=new SpringApplication(DiveInSpringBootApplication.class);
        springApplication.run(args);
        System.out.println("spring boot启动完成");

    }

}
