package MainTask;

public class CreditAccount extends BankAccount{
    private double months;

    public CreditAccount(double sum, double interest_rate, int months){
        super(sum, interest_rate);
        this.months = months;
    }
    // сума х ((1 + лихвения процент) на степен N)

    @Override
    public double pay() {
        return getSum() * Math.pow(((1 + getInterest() * 0.01)), months);
    }
}
