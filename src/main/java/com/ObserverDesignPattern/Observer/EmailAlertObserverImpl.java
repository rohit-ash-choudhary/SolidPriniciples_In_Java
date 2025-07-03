package com.ObserverDesignPattern.Observer;

import com.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotifacationAlertObserver{

    String emailid;
    StockObservable stockobservable;

    public EmailAlertObserverImpl(String emailid,StockObservable stockobservable)
    {

        this.emailid=emailid;
        this.stockobservable=stockobservable;
    }

    @Override
    public void update() {
        sendMail(emailid,"this is product stock again, harry up");
    }

    public void sendMail(String emailid,String mail)
    {
        System.out.println("sent mail to "+ emailid);
    }
}
