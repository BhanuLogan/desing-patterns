package patterns.factory;

public class SlackMessageService implements MessageDeliveryService {

    @Override
    public void send(String message) {
        System.out.println("Slack message: " + message);
    }

}
