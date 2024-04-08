package patterns.composite.model;

import java.util.List;

public class Box extends Product {

    private List<Product> products;

    public Box(int id, List<Product> products) {
        super(id);
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public void remove(int id) {
        Product product = find(id);
        if(product != null) {
            products.remove(product);
        }
    }

    private Product find(int id) {
        for(Product product : products) {
            if(product.id == id) {
                return product;
            }
        }
        return null;
    }  

    @Override
    public double getPrice() {
        double totalCost = 0;
        for(Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
    
}
