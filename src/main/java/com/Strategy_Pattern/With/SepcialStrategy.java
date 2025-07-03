package com.Strategy_Pattern.With;

public class SepcialStrategy implements NavigationStrategy{
    @Override
    public void buildMapNav() {
        System.out.println("this is special  map");
    }
}
