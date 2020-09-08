package com.director.repo.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty  {

    String name();


    String value();

}
