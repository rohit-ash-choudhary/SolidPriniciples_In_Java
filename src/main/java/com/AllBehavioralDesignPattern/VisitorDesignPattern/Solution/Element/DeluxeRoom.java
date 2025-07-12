package com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element;

import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor.RoomVisitor;

public class DeluxeRoom implements RoomElement {
    public int roomprice;

    @Override
    public void accept(RoomVisitor roomvistor) {
        roomvistor.visit(this);
    }
}
