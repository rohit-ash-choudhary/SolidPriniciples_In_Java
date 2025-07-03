package com.ObserverDesignPattern.Observer;

import com.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotifacationAlertObserver{

    String userid;
    StockObservable stockobservable;


    public MobileAlertObserverImpl(String userid,StockObservable observable)
    {
        this.userid=userid;
        this.stockobservable=observable;
    }
    @Override
    public void update() {
        sentAlertOnMobile(userid,"harryup up product back in stock");
    }

    public void sentAlertOnMobile(String userid, String message)
    {
        System.out.println("message sent to "+userid);
    }
}
