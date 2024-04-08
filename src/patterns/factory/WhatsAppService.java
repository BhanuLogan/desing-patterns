package patterns.factory;

public class WhatsAppService implements MessageDeliveryService {

    @Override
    public void send(String message) {
        System.out.println("WhatsApp message: " + message);
    }

}
