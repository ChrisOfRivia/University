package Ex1;

public class CompanyET extends Company {
    String name;
    double initial_capital;
    double relevant_capital;

    CompanyET(String company_name, String date_of_company, String bulstat, String name, double initial_capital, double relevant_capital){
        super(company_name, date_of_company, bulstat);
        this.name = name;
        this.initial_capital = initial_capital;
        this.relevant_capital = relevant_capital;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public double getInitial_capital(){
        return this.initial_capital;
    }

    public void setInitial_capital(double new_initial_capital){
        this.initial_capital = new_initial_capital;
    }

    public double getRelevant_capital(){
        return this.relevant_capital;
    }

    public void setRelevant_capital(double new_relevant_capital){
        this.relevant_capital = new_relevant_capital;
    }

    protected double getProfit(){
        return this.relevant_capital - this.initial_capital;
    }
}
