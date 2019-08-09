package com.yto.project.annotion.fruit;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
@Slf4j
public class AnnotionUtils {

    public static void parseAnnotion(Class c){
        Field[] fields = c.getDeclaredFields();
        for (Field field: fields) {
            if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                log.info(fruitColor.fruitColor().toString());
            }else if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                log.info(fruitName.value());
            }else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                log.info(fruitProvider.id()+";"+fruitProvider.name()+";"+fruitProvider.address());
            }
        }
    }
}
