package com.yto.project.annotion.fruit;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {

    Corlor fruitColor() default Corlor.GREEN;
}
