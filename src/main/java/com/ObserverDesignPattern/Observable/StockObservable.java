package com.ObserverDesignPattern.Observable;

import com.ObserverDesignPattern.Observer.NotifacationAlertObserver;

public interface StockObservable {
    public void add(NotifacationAlertObserver observer);

    public void remove(NotifacationAlertObserver observer);

    public void notifySubscribe();

    public void setStockCount(int newStockAdded);

    public int getCount();
}
