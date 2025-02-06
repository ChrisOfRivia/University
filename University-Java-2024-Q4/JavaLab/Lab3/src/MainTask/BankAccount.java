package MainTask;

public abstract class BankAccount implements Payable{
    private double sum;
    private double interest;

    public BankAccount(double sum, double interestRate) {
        this.sum = sum;
        this.interest = interestRate;
    }

    public double getSum() {
        return sum;
    }


    public void setSum(double sum) {
        this.sum = sum;
    }


    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
