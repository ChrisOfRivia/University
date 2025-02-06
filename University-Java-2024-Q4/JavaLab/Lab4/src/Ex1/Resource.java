package Ex1;

public class Resource {
    double amount;
    double harvestRate;

    Resource(double amount, double harvestRate){
        this.amount = amount;
        this.harvestRate = harvestRate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setHarvestRate(double harvestRate) {
        this.harvestRate = harvestRate;
    }

    public double getAmount() {
        return amount;
    }

    public double getHarvestRate() {
        return harvestRate;
    }

    public void harvest(){

    }
}
