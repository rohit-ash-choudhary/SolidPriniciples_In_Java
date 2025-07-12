package com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Command;

import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Receiver.AirConditioner;

public class TurnAcOnCommand implements CommandInterface {

    AirConditioner ac;

    TurnAcOnCommand(AirConditioner ac)
    {
        this.ac=ac;
    }

    @Override
    public void execute() {

        ac.turnOnAc();
    }
}
