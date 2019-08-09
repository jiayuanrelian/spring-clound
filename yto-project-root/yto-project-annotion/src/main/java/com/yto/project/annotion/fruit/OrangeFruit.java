package com.yto.project.annotion.fruit;

import lombok.Data;

@Data
public class OrangeFruit {

    @FruitColor(fruitColor=Corlor.ORANGE)
    private String fruitColor;

    @FruitName("orange")
    private String fruitName;

    @FruitProvider(id=110,name = "西安提供商",address = "西安大雁塔")
    private String fruitProvider;
}
