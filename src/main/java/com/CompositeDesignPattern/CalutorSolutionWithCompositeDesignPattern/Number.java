
package com.CompositeDesignPattern.CalutorSolutionWithCompositeDesignPattern;

public class Number implements ArithmeticExpression{

    int number;
    public Number(int i){this.number=number;}

    public int evaluate(){
        System.out.println("This is the number"+ number);
        return number;
    }
}
