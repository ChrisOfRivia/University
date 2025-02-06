package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type of message -> SMS/Push/Email: ");
        String messageType = sc.nextLine();

        try{
            Message message = MessageFactory.createMessage(messageType);
            message.send();
        }catch (IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
