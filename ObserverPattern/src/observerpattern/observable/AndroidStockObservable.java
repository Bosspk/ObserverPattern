package observerpattern.observable;

import observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidStockObservable implements StockObservable {

    private List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    private int stockCount;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObserver() {
        for (NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList) {
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStock(int newStockCount) {
        if (stockCount == 0) {
            notifyObserver();
        }
        stockCount = stockCount + newStockCount;
    }

    @Override
    public Integer getStock() {
        return stockCount;
    }
}
