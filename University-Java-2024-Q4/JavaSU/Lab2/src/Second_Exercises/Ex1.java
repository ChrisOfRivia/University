package Second_Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(i + 1);
        }
        sc.close();
    }
}
