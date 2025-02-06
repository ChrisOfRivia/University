package First_Exercises;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number [100;200]: ");
        int a = sc.nextInt();
        if(a >= 100 && a <= 200){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
