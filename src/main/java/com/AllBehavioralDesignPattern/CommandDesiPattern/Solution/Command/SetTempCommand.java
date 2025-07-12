package com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Command;

import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Receiver.AirConditioner;

public class SetTempCommand implements CommandInterface{

    AirConditioner ac;

    SetTempCommand(AirConditioner ac)
    {
        this.ac=ac;
    }
    @Override
    public void execute() {

    }
}
