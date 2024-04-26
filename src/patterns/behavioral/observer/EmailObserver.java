package patterns.behavioral.observer;

import java.util.List;

public class EmailObserver implements Observer {

    private Product product;

    List<String> emails = List.of("bhanukumar@gmail.com", "divyaganta@gmail.com");

    EmailObserver(Product product) {
        this.product = product;
    }

    @Override
    public void notifyObserver() {
        for(String email : emails) {
            System.out.println("Sending email to " + email);
            System.out.println("New stock was added for model - " + product.name + ". Hurry Up!!!" );
            System.out.println("Successfully sent email to " + email);
            System.out.println();
        }
    }
}
