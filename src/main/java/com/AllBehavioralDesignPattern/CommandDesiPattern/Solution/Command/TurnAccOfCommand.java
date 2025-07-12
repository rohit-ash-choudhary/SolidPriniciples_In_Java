package com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Command;

import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Receiver.AirConditioner;

public class TurnAccOfCommand  implements CommandInterface{

    AirConditioner ac;

    public TurnAccOfCommand(AirConditioner ac)
    {
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }
}
