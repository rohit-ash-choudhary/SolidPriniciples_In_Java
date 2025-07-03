package com.ObserverDesignPattern.Observer;

import com.ObserverDesignPattern.Observable.IphoneObservalImpl;
import com.ObserverDesignPattern.Observable.StockObservable;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable=new IphoneObservalImpl();

        NotifacationAlertObserver observer1=new MobileAlertObserverImpl("rc7792",iphoneStockObservable);
        NotifacationAlertObserver observer2=new MobileAlertObserverImpl("rk7792",iphoneStockObservable);
        NotifacationAlertObserver observer3=new EmailAlertObserverImpl("ashhh@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        //iphoneStockObservable.setStockCount(10);
       // iphoneStockObservable.setStockCount(100);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);

    }
}
