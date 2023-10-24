package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class TextMsgAlertObserver implements NotificationAlertObserver {

    private StockObservable stockObservable;

    String mobileNumber;

    public TextMsgAlertObserver(String mobileNumber, StockObservable observable) {
        this.mobileNumber = mobileNumber;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendStockAlertMessage("Product is in stock now");
    }

    private void sendStockAlertMessage(String productIsInStockNow) {
        System.out.println(productIsInStockNow + "sent to " + mobileNumber);
    }
}
