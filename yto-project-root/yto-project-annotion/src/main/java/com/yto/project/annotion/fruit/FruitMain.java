package com.yto.project.annotion.fruit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FruitMain {
    public static void main(String[] args) {
        log.info("START...");
        AnnotionUtils.parseAnnotion(OrangeFruit.class);
        log.info("END...");
    }
}
