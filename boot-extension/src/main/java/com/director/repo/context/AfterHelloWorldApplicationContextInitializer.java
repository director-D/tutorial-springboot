package com.director.repo.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer, Ordered {


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("After applicatio.id = " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}