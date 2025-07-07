package com.ChaiNofResponsibilityDesignPattern;

public class TeamManager extends LeaveHandler{
    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= 7)
        {
            System.out.println("Manager approved " + leaveDays + " day(s) leave.");
        } else if (nextHandler!=null){


            nextHandler.handleRequest(leaveDays);

        }
    }
}
