package com.FactoryVsAbstactFac.Factory.With;

public class ChairFactory {

    public static Chair getChair(String type){
       if(type.equalsIgnoreCase("plastic"))
       {
           return new PlasticChair();
       } else if
        (type.equalsIgnoreCase("wooden"))
        {
            return new WoodenChair();
        }
       else {
           return null;
       }
    }
}
