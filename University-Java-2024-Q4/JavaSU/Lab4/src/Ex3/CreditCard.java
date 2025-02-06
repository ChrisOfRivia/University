package Ex3;

public class CreditCard extends PaymentMethod{
    @Override
    void processPayment() {
        System.out.println("Paying with Credit Card...");;
    }
}
