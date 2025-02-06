import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("USD: ");
        double usd = sc.nextDouble();
        System.out.printf("%.2f USD -> %.2f BGN", usd, usd * 1.79549);
        sc.close();
    }
}
