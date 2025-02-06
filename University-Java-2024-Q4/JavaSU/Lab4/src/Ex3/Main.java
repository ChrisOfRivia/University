package Ex3;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        creditCard.processPayment();
        payPal.processPayment();
    }
}
