import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Days of campaign: ");
        int days_campaign = sc.nextInt();
        System.out.print("Number of bakers: ");
        int bakers = sc.nextInt();
        System.out.print("Cakes: ");
        int cakes = sc.nextInt();
        System.out.print("Waffles: ");
        int waffles = sc.nextInt();
        System.out.print("Pancakes: ");
        int pancakes = sc.nextInt();
        System.out.println(((bakers * days_campaign) / ((cakes * 45) + (waffles * 5.8) + (pancakes * 3.2))) * 1.8);
        sc.close();
    }
}
