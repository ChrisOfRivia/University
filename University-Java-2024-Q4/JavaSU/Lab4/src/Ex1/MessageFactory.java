package Ex1;

public class MessageFactory {
    public static Message createMessage(String type){
        switch(type){
            case "Email": return new EmailMessage();
            case "Push": return new PushNotification();
            case "SMS": return new SMSMessage();
            default: throw new IllegalArgumentException("Unknown message type!");
        }
    }
}
