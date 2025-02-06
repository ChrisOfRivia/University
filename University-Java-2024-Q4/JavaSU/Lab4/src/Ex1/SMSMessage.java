package Ex1;

public class SMSMessage implements Message{

    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}
