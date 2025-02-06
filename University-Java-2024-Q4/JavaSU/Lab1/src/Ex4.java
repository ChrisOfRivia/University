import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num 1: ");
        double a = sc.nextDouble();
        System.out.print("Num 2: ");
        double b = sc.nextDouble();
        System.out.printf("%.2f + %.2f = %.2f", a, b, a+b);
        sc.close();
    }
}
