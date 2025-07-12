package com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor;

import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DeluxeRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DoubleRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.SingleRoom;

public class RoomPriceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleroom) {
        System.out.println("price computing for single room");
        singleroom.roomprice=1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("price computing for double room");
        doubleRoom.roomprice=2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("price computing for double room");
        deluxeRoom.roomprice=2000;
    }
}
