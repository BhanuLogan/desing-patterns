package patterns.behavioral.observer;

import java.util.List;

public abstract class Subject {
    protected Product product;
    protected List<Observer> observers;

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public abstract void addQuantity(int quantity);
    public abstract void notifySubscribers();

}
