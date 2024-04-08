package patterns.composite.model;

public abstract class Product {
    public int id;
    public String name;
    public double price;

    protected Product() {}
    protected Product(int id) {
        this.id = id;
        this.name = "box";
    }
    protected Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double getPrice();
}