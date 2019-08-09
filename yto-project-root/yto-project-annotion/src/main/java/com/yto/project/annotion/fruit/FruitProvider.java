package com.yto.project.annotion.fruit;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {

    public int id() default 0;

    public String name() default "";

    public String address() default "";
}
