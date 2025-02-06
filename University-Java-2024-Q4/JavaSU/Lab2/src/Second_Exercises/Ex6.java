package Second_Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int a = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < a; i++) {
            System.out.printf("[%d] Number: ", i + 1);
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum: "+sum);
    }
}
