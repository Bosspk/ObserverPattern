package observerpattern.observable;

import observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifyObserver();

    void setStock(int newStockCount);

    Integer getStock();
}
