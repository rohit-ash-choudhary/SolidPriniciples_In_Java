package com.AllBehavioralDesignPattern.MediatorDesignPattern.Mediator;

import com.AllBehavioralDesignPattern.MediatorDesignPattern.Bidder.ColleageB;

public interface AuctionMediator {


    void AddBidder(ColleageB bidder);


    void placeBid(ColleageB bidder, int bidAmount);
}
