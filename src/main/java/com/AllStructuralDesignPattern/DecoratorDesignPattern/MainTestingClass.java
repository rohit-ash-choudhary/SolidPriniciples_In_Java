package com.AllStructuralDesignPattern.DecoratorDesignPattern;

import com.AllStructuralDesignPattern.DecoratorDesignPattern.Decorator.ExtraCheese;
import com.AllStructuralDesignPattern.DecoratorDesignPattern.Decorator.ExtraMashroom;

public class MainTestingClass {

    public static void main(String[] args) {
        BasePizza basepizza=new ExtraMashroom(new ExtraCheese(new FarmhousePizza()));
        basepizza.cost();
        System.out.println(basepizza.cost());
    }
}
