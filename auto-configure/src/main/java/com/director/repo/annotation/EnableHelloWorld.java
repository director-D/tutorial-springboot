package com.director.repo.annotation;


import com.director.repo.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)
//@Configuration
public @interface EnableHelloWorld {

    /**
     *
     * 1:Enable 的第一种方式，直接使用import引入一个class(可是是任意的bean,不需要被@Configuration注解)
     *   如果 @EnableHelloWorld 没有被 @Component 或者  @Configuration 注解的话，只能作为引导类的注解，
     *   因为不加的在引导类上 又没有 相应的扫描机制，bean 是无法被加载的
     *
     *
     * 2：或者 EnableHelloWorld 不添加 @Component 或者  @Configuration ，新建一个自动配置类，在新的配置类上
     *      同时使用 @Component 或者  @Configuration 和 @EnableHelloWorld 注解 ，就相当于能自动把需要的bean
     *      在启动的时候注入到容器了
     *
     *
     *
     *
     */



}
