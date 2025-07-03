package com.ObserverDesignPattern.Observable;

import com.ObserverDesignPattern.Observer.NotifacationAlertObserver;

import java.util.ArrayList;

public class IphoneObservalImpl implements StockObservable {

    public ArrayList<NotifacationAlertObserver> observerlist=new ArrayList<>();
    public int stockcount=0;
    @Override
    public void add(NotifacationAlertObserver observer) {
        observerlist.add(observer);
    }

    @Override
    public void remove(NotifacationAlertObserver observer) {
        observerlist.remove(observer);
    }

    @Override
    public void notifySubscribe() {


        for(NotifacationAlertObserver observer: observerlist)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
          if(stockcount==0)
          {
              notifySubscribe();
          }
        stockcount=stockcount+newStockAdded;
    }

    @Override
    public int getCount() {
        return stockcount;
    }
}
