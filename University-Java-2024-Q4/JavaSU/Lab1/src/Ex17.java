import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length cm: ");
        double length = sc.nextDouble() / 10;
        System.out.print("Width cm: ");
        double width = sc.nextDouble() / 10;
        System.out.print("Height cm: ");
        double height = sc.nextDouble() / 10;
        System.out.print("Procent: ");
        double procentage_filled = sc.nextDouble();

        double volume = length * width * height;
        System.out.printf("%.2f liters", volume * (1-(procentage_filled * 0.01)));
    }
}
