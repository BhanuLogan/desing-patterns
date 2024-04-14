package patterns.decorator.example_1;

public class Raitha extends Biryani {
    private FoodItem item;


    public Raitha(FoodItem item, String name, double price) {
        super(name, price);
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + price;
    }

    @Override
    public String getItemName() {
        return item.getItemName() + " + " + name;
    }
}
