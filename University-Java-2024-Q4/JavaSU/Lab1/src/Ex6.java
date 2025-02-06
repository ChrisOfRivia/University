import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.printf("%.2f inches -> %.2f centimeters", inches, inches * 2.54);
        sc.close();
    }
}
