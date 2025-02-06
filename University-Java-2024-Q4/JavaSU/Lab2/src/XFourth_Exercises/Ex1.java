package XFourth_Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Budget: ");
        double budget = sc.nextDouble();
        System.out.print("Actors: ");
        int actors = sc.nextInt();
        System.out.print("Price of clothes: ");
        double price_clothes_for_one = sc.nextDouble();
        double decor = budget * 0.10;

        if(actors > 150){
            price_clothes_for_one -= price_clothes_for_one * 0.10;
        }

        if(budget >= (price_clothes_for_one * actors) + decor){
            System.out.println("Budget is enough!");
        }
        else {
            System.out.println("Budget is not enough!");
            System.out.println(Math.abs(budget - ((price_clothes_for_one * actors) + decor)));
        }


        sc.close();
    }
}
