import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Deposit: ");
        float sum = sc.nextFloat();
        System.out.print("Months: ");
        int time_months = sc.nextInt();
        System.out.print("Yearly tax: ");
        float yearly_tax = sc.nextFloat();
        System.out.println(sum + time_months * ((sum * yearly_tax)/12));
        sc.close();
    }
}
