package patterns.composite.model;

public class Laptop extends Product {

    public Laptop(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getPrice() {
        System.out.printf("%02d\t%-30s\t%.2f\n", id, name, price);
        return price;
    }
}