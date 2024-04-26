package patterns.behavioral.observer;

public class Product {
    public String name;
    private int quantity;

    Product(String name) {
        this.name = name;
        this.quantity = 0;
    }

    public void add(int quantity) {
        this.quantity += quantity;
    }

    public boolean hasStock() {
        return quantity > 0;
    }
}
