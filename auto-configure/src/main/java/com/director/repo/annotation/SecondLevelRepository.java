package com.director.repo.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@FirstLevelRespository
public @interface SecondLevelRepository {

    String value() default "";

}
