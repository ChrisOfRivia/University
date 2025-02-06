package Second_Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
