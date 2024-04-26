package patterns.behavioral.observer;

import java.util.List;

public class SmsObserver implements Observer {

    private Product product;

    List<String> mobileNumbers = List.of("485489548", "5489854954");

    SmsObserver(Product product) {
        this.product = product;
    }

    @Override
    public void notifyObserver() {
        for(String mobile : mobileNumbers) {
            System.out.println("Sending SMS to " + mobile);
            System.out.println("New stock was added for model - " + product.name + ". Hurry Up!!!" );
            System.out.println("Successfully sent SMS to " + mobile);
            System.out.println();
        }
    }

}
