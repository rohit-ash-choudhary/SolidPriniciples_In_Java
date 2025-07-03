package com.Strategy_Pattern.With;

public class NormalMapStragey extends SepcialStrategy implements NavigationStrategy{
    @Override
    public void buildMapNav() {
        System.out.println("Thi is normla map");
    }
}
