package com.Strategy_Pattern.With;

public class Navigation {

    NavigationStrategy navigatiostrategy;

    //this is constructor injection
    Navigation(SepcialStrategy normalMapStragey)
    {
        this.navigatiostrategy=navigatiostrategy;
    }

    public void buildMapNav()
    {
        navigatiostrategy.buildMapNav();
    }

}
