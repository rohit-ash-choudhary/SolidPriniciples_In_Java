package com.AllBehavioralDesignPattern.MediatorDesignPattern.Bidder;

import com.AllBehavioralDesignPattern.MediatorDesignPattern.Mediator.AuctionMediator;

public class Bidder implements ColleageB {

    String name;
    AuctionMediator auctionmediator;
    public Bidder(String name, AuctionMediator auctionmediator) {
        this.name = name;
        this.auctionmediator = auctionmediator;
        auctionmediator.AddBidder(this);
    }





    @Override
    public void placeBid(int bidAmount) {
         auctionmediator.placeBid(this,bidAmount);
    }

    @Override
    public void getBidnotification(int bitAmount) {
        System.out.println("bidder "+ name +" place the bid   "+bitAmount);
    }

    @Override
    public String getname() {
        return this.name;
    }
}
