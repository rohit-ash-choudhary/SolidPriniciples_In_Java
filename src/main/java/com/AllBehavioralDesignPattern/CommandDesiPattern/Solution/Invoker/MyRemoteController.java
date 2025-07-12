package com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Invoker;

import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Command.CommandInterface;

public class MyRemoteController {

    CommandInterface commad;

    public MyRemoteController(){}

    public void setCommad(CommandInterface commandInterface){
        this.commad=commandInterface;

    }
    public void pressButton(){
        commad.execute();
    }
}
