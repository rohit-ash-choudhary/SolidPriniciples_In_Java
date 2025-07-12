package com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Client;

import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DeluxeRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DoubleRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.RoomElement;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.SingleRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor.RoomPriceVisitor;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor.RoomVisitor;

public class Client {


    public static void main(String[] args) {

        RoomElement singleroomobj=new SingleRoom();
        RoomElement doubleroomobj=new DoubleRoom();
        RoomElement deluxroom=new DeluxeRoom();

        RoomVisitor singleroomprice=new RoomPriceVisitor();


        singleroomobj.accept(singleroomprice);
        System.out.println("Single Room Price: " + ((SingleRoom)singleroomobj).roomprice);




    }


}
