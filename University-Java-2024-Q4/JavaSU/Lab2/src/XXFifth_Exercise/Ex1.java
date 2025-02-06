package XXFifth_Exercise;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Figure: ");
        String figure = sc.nextLine();

        switch (figure){
            case "Square":
                System.out.print("Square a: ");
                double square_a = sc.nextDouble();
                System.out.printf("%.3f", square_a * square_a);
                break;
            case "Rectangle":
                System.out.print("Rectangle a: ");
                double rectangle_a = sc.nextDouble();
                System.out.print("Rectangle b: ");
                double rectangle_b = sc.nextDouble();
                System.out.printf("%.3f", rectangle_a * rectangle_b);
                break;
            case "Circle":
                System.out.print("Circle radius: ");
                double circle_r = sc.nextDouble();
                System.out.printf("%.3f", Math.PI * circle_r * circle_r);
                break;
            case "Triangle":
                System.out.print("Triangle a: ");
                double triangle_a = sc.nextDouble();
                System.out.print("Triangle ha: ");
                double triangle_ha = sc.nextDouble();
                System.out.printf("%.3f", (triangle_a * triangle_ha) / 2);
                break;
        }
    }
}
