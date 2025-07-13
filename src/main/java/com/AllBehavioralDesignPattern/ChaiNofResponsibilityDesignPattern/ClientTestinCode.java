package com.AllBehavioralDesignPattern.ChaiNofResponsibilityDesignPattern;

public class ClientTestinCode {
    public static void main(String[] args) {
        LeaveHandler teamLead=new TeamLead();
        LeaveHandler teamManager=new TeamManager();
        LeaveHandler lineManager=new LineManager();

        teamLead.setNextHandler(teamManager);
        teamManager.setNextHandler(lineManager);

        teamLead.handleRequest(3);
        teamLead.handleRequest(5);
        teamLead.handleRequest(15);
        teamLead.handleRequest(45);

    }
}
