package com.AllBehavioralDesignPattern.MediatorDesignPattern.Mediator;

import com.AllBehavioralDesignPattern.MediatorDesignPattern.Bidder.ColleageB;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<ColleageB> colleageBS = new ArrayList<>();

    @Override
    public void AddBidder(ColleageB bidder) {
        colleageBS.add(bidder);
    }




    @Override
    public void placeBid(ColleageB bidder, int bidAmount) {
        for (ColleageB collageb : colleageBS) {
            if (collageb.getname().equals(bidder.getname())) {
                collageb.getBidnotification(bidAmount);
            }
        }
    }
}
