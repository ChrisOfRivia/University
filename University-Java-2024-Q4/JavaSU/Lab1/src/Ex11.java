import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of owner's dogs: ");
        int owner_dogs = sc.nextInt();
        System.out.print("Number of other dogs: ");
        int other_dogs = sc.nextInt();
        System.out.printf("%.2f lv.", (owner_dogs * 2.5) + (other_dogs * 4));
        sc.close();
    }
}
