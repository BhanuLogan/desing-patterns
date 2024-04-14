package patterns.decorator;

import commons.DesignPatternService;
import patterns.decorator.example_1.Biryani;
import patterns.decorator.example_1.FoodItem;
import patterns.decorator.example_1.Pepsi;
import patterns.decorator.example_1.Raitha;

public class DecoratorPatternService implements DesignPatternService {

    private void testDecoratorPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("DECORATOR DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");
        testExample1();
        testExample2();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    private void testExample1() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("EXAMPLE - 1");
        System.out.println("-------------------------------------------------\n");

        FoodItem biryani = new Biryani("Dum Biryani", 149);
        FoodItem rb = new Raitha(biryani, "Raitha", 8);
        FoodItem prb = new Pepsi(rb, "Pepsi", 20);

        System.out.println("Items: " + prb.getItemName());
        System.out.println("Price: " + prb.getPrice());

        System.out.println("Items: " + rb.getItemName());
        System.out.println("Price: " + rb.getPrice());

        FoodItem bp = new Pepsi(biryani, "Pepsi", 20);
        System.out.println("Items: " + bp.getItemName());
        System.out.println("Price: " + bp.getPrice());

    }

    private void testExample2() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("EXAMPLE - 2");
        System.out.println("-------------------------------------------------\n");
    }

    @Override
    public void runExample() {
        testDecoratorPattern();
    }
}
