package patterns.behavioral.observer;

import java.util.ArrayList;

public class ProductObservable extends Subject {

    public ProductObservable(Product product) {
        this.product = product;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addQuantity(int quantity) {
        if(!product.hasStock()) {
            notifySubscribers();
        }
        product.add(quantity);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : observers) {
            observer.notifyObserver();
        }
    }

}
