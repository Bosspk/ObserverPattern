package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    private StockObservable stockObservable;

    String emailId;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendStockAlertEmail("Product is in stock now, hurry up!");
    }

    private void sendStockAlertEmail(String productIsInStockNow) {
        System.out.println(productIsInStockNow + "sent to: " + emailId);
    }
}
