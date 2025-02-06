import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Meters: ");
        double meters = sc.nextDouble();
        System.out.printf("The final price is: %.2f lv.\n", (meters * 7.61) * 0.18);
        System.out.printf("The discount is: %.2f lv.", (meters * 7.61) - ((meters * 7.61) * 0.18));
        sc.close();
    }
}
