package patterns.factory;

public class SmsService implements MessageDeliveryService {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }

}
