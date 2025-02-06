package Ex3;

public class PayPal extends PaymentMethod{

    @Override
    void processPayment() {
        System.out.println("Paying with PayPal...");;
    }
}
