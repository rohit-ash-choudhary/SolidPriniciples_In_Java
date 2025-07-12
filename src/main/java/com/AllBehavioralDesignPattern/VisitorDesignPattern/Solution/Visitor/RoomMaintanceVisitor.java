package com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor;

import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DeluxeRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DoubleRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.SingleRoom;

public class RoomMaintanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleroom) {
        System.out.println("main for single room for single room");

    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("main for double room for single room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("main for delux room for single room");
    }
}
