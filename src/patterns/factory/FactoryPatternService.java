package patterns.factory;

import commons.DesignPatternService;
import util.Constants.MessageSender;

public class FactoryPatternService implements DesignPatternService {

    private void testFactoryPattern() throws Exception {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("FACTORY DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        MessageDeliveryService smsService = MessageDeliveryServiceFactory.getInstance(MessageSender.SMS);
        smsService.send("Hi");

        MessageDeliveryService slackService = MessageDeliveryServiceFactory.getInstance(MessageSender.SLACK);
        slackService.send("Hello");

        MessageDeliveryService whatsAppService = MessageDeliveryServiceFactory.getInstance(MessageSender.WHATSAPP);
        whatsAppService.send("How are you?");

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        try {
            testFactoryPattern();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
