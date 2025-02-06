package Ex1;

public class PushNotification implements Message{

    @Override
    public void send() {
        System.out.println("Sending push notification...");
    }
}
