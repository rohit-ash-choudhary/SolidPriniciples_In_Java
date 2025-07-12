package com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor;

import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DeluxeRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.DoubleRoom;
import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element.SingleRoom;

public interface RoomVisitor {

    public void visit(SingleRoom singleroom);
    public void visit(DoubleRoom doubleRoom);
    public void visit(DeluxeRoom deluxeRoom);
}