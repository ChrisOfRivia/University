package Ex1;

public class Ex1 {

    public static void main(String[] args) {
        Company company = new Company("AAA", "2024-04-04", "AAAARRRRR");
        System.out.println(company.bulstat);

        company.setBulstat("AAAAAAAAAA");
        CompanyET worker = new CompanyET(company.name, company.date_of_company, company.bulstat, "John", 5000.25, 100500.5);
        double funds = worker.getProfit();
        System.out.println(funds);
    }
}
