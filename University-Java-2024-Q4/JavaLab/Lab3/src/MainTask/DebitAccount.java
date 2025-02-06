package MainTask;

public class DebitAccount extends BankAccount{
    public DebitAccount(double sum, double interestRate) {
        super(sum, interestRate);
    }

    @Override
    public double pay() {
        return getSum() + (getSum() * getInterest()) * 0.01;
    }
}
