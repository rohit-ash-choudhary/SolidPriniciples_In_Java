package com.DecoratorDesignPattern.Decorator;

import com.DecoratorDesignPattern.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    protected BasePizza basePizza;


    public ToppingDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
}
