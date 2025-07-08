package com.AllStructuralDesignPattern.DecoratorDesignPattern.Decorator;

import com.AllStructuralDesignPattern.DecoratorDesignPattern.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    protected BasePizza basePizza;


    public ToppingDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
}
