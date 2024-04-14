package patterns.decorator.example_1;

public class Biryani implements FoodItem {

    protected double price;
    protected String name;
    
    public Biryani(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getItemName() {
        return name;
    }

}
