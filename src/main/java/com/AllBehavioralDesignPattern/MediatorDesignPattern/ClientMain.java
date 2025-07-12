package com.AllBehavioralDesignPattern.MediatorDesignPattern;

import com.AllBehavioralDesignPattern.MediatorDesignPattern.Bidder.Bidder;
import com.AllBehavioralDesignPattern.MediatorDesignPattern.Bidder.ColleageB;
import com.AllBehavioralDesignPattern.MediatorDesignPattern.Mediator.Auction;
import com.AllBehavioralDesignPattern.MediatorDesignPattern.Mediator.AuctionMediator;

public class ClientMain {

    public static void main(String[] args) {

        AuctionMediator ac=new Auction();
        ColleageB collage1=new Bidder("Aman ",ac);
        ColleageB collage2=new Bidder("Karan ",ac);


        collage1.placeBid(1000);
        collage2.placeBid(30000);




    }
}
