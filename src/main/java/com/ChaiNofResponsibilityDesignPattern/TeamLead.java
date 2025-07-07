package com.ChaiNofResponsibilityDesignPattern;

public class TeamLead extends LeaveHandler{
    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays<=3)
        {
            System.out.println("Teamlead approved the "+ leaveDays +"days leave");
        } else if (nextHandler != null) {
             nextHandler.handleRequest(leaveDays);
        }
    }
}
