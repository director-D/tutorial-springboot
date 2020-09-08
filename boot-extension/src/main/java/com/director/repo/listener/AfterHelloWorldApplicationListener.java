package com.director.repo.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("AfterHelloWorld : "+event.getApplicationContext().getId()
                + " , timestamp : "+event.getTimestamp());

    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
