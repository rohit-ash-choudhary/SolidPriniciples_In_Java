package com.AllStructuralDesignPattern.FlyWeightDesignPattern.Solution;

import java.util.HashMap;
import java.util.Map;

import com.AllStructuralDesignPattern.FlyWeightDesignPattern.Solution.Robot;
//this is class for how to cache data
public class RoboticFactory {

    private static Map<String, Robot> roboticObjectCache=new HashMap<>();

    public static Robot createRobot(String robotType){
         if(roboticObjectCache.containsKey(robotType))
         {
             return roboticObjectCache.get(robotType);
         }
         else {
             if (robotType=="HUMANOID")
             {
                 Sprintes humanSprintes=new Sprintes();
                 Robot humanObjedct=new HumaniodRobot(robotType,humanSprintes);
                 roboticObjectCache.put(robotType,humanObjedct);
                 return humanObjedct;

             } else if (robotType=="MACHINOID") {
                 Sprintes machineSprint=new Sprintes();
                 Robot machineObject=new HumaniodRobot(robotType,machineSprint);
                 return machineObject;
             }
         }
         return null;
    }


}
