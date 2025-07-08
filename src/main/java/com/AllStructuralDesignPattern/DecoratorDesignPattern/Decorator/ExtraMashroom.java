package com.AllStructuralDesignPattern.DecoratorDesignPattern.Decorator;

import com.AllStructuralDesignPattern.DecoratorDesignPattern.BasePizza;

public class ExtraMashroom extends ToppingDecorator{

    public ExtraMashroom(BasePizza basepizza)
    {
      super(basepizza);
    }

    @Override
    public int cost() {
       return basePizza.cost()+20;
    }
}
