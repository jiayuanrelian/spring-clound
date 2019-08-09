package com.yto.project.annotion.fruit;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitName {

    public String value() default "";
}
