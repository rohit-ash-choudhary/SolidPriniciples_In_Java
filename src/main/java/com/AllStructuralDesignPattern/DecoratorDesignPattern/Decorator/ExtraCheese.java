package com.AllStructuralDesignPattern.DecoratorDesignPattern.Decorator;

import com.AllStructuralDesignPattern.DecoratorDesignPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    public ExtraCheese(BasePizza basepizza)
    {
        super(basepizza);
    }


    @Override
    public int cost() {
        return basePizza.cost()+10;
        //give base prize of basePizza
    }
}
