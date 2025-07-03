package com.DecoratorDesignPattern;

import com.DecoratorDesignPattern.Decorator.ExtraCheese;
import com.DecoratorDesignPattern.Decorator.ExtraMashroom;

public class MainTestingClass {

    public static void main(String[] args) {
        BasePizza basepizza=new ExtraMashroom(new ExtraCheese(new FarmhousePizza()));
        basepizza.cost();
        System.out.println(basepizza.cost());
    }
}
