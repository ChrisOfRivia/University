import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price Strawberries/kg: ");
        float price_strawberries_kg = sc.nextFloat();
        System.out.print("Bananas qty/kg: ");
        float qty_bananas_kg = sc.nextFloat();
        System.out.print("Oranges qty/kg: ");
        float qty_oranges_kg = sc.nextFloat();
        System.out.print("Raspberries qty/kg: ");
        float qty_raspberries_kg = sc.nextFloat();
        System.out.print("Strawberries qty/kg: ");
        float qty_strawberries_kg = sc.nextFloat();

        double price_raspberries = price_strawberries_kg / 2;
        double price_oranges = price_raspberries * 0.4;
        double price_bananas = price_raspberries * 0.8;

        System.out.println((price_strawberries_kg * qty_strawberries_kg) + (price_raspberries * qty_raspberries_kg) + (price_oranges * qty_oranges_kg) + (price_bananas * qty_bananas_kg));
        sc.close();
    }
}
