package com.AllStructuralDesignPattern.FlyWeightDesignPattern.Problem;

public class MainClient {

    public static void main(String[] args) {
        int x=0;
        int y=0;
        for (int i = 0; i < 500000; i++) {

            Sprintes humansprintes=new Sprintes();
            Robot humoidrobots=new Robot(x+1,y+1,"Humoid",humansprintes);




        }
        for (int i = 0; i < 500000; i++) {


            Sprintes machineSprints = new Sprintes();
            Robot machinerobots = new Robot(x + 1, y + 1, "Machine", machineSprints);
        }

    }
}
