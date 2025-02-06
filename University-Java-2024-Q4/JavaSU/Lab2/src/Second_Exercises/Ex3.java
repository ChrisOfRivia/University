package Second_Exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if(i % 3 != 0 && i % 7 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
