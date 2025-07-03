package com.Strategy_Pattern.With;

public class TouristMap extends Navigation{

    TouristMap(){
        super(new SepcialStrategy());
    }
}
