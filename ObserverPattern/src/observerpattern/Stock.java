package observerpattern;

import observerpattern.observable.AndroidStockObservable;
import observerpattern.observable.StockObservable;
import observerpattern.observer.EmailAlertObserver;
import observerpattern.observer.NotificationAlertObserver;
import observerpattern.observer.TextMsgAlertObserver;

public class Stock {
    public static void main(String[] args) {

        StockObservable androidStockObservable = new AndroidStockObservable();
        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserver("xyz@gmail.com", androidStockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserver("abc@gmail.com", androidStockObservable);
        NotificationAlertObserver notificationAlertObserver3 = new TextMsgAlertObserver("12345678", androidStockObservable);

        androidStockObservable.add(notificationAlertObserver1);
        androidStockObservable.add(notificationAlertObserver2);
        androidStockObservable.add(notificationAlertObserver3);

        androidStockObservable.setStock(10);
        androidStockObservable.setStock(0);
        androidStockObservable.setStock(100);
    }
}
