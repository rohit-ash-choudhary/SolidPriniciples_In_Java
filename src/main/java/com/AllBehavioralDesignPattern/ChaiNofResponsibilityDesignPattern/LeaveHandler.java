package com.AllBehavioralDesignPattern.ChaiNofResponsibilityDesignPattern;

public abstract class LeaveHandler {
    protected LeaveHandler nextHandler;

    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int leaveDays);
}

