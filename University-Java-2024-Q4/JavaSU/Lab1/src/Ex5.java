import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.printf("S = %.2f * %.2f = %.2f", a, a, a*a);
        sc.close();
    }
}
