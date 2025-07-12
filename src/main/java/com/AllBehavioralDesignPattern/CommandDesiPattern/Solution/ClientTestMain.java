package com.AllBehavioralDesignPattern.CommandDesiPattern.Solution;

import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Command.TurnAccOfCommand;
import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Invoker.MyRemoteController;
import com.AllBehavioralDesignPattern.CommandDesiPattern.Solution.Receiver.AirConditioner;

public class ClientTestMain {

    public static void main(String[] args) {
        AirConditioner ac=new AirConditioner();
        MyRemoteController rc=new MyRemoteController();

        rc.setCommad(new TurnAccOfCommand(ac));
        rc.pressButton();

    }
}
