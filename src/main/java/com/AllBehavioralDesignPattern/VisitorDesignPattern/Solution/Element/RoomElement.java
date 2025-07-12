package com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Element;

import com.AllBehavioralDesignPattern.VisitorDesignPattern.Solution.Visitor.RoomVisitor;

public interface RoomElement {

    public void accept(RoomVisitor roomvistor);
}
