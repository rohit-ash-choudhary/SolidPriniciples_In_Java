package com.ChaiNofResponsibilityDesignPattern;

public class LineManager extends LeaveHandler {
    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays<=30)
        {
            System.out.println("Director approved " + leaveDays + " day(s) leave.");
        } else {
            System.out.println("Leave request denied: too many days.");
           // nextHandler.handleRequest(leaveDays);
        }
    }
}
