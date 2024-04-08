package patterns.factory;

import util.Constants.MessageSender;

public class MessageDeliveryServiceFactory {

    public static MessageDeliveryService getInstance(MessageSender sender) throws Exception {
        switch (sender) {
            case SMS:
                return new SmsService();
            case SLACK:
                return new SlackMessageService();
            case WHATSAPP:
                return new WhatsAppService();
            default:
                throw new Exception("Invalid sender");
        }
    }
}
