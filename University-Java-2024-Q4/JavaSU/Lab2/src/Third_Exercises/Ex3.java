package Third_Exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number >= 1 && % 5 == 0: ");
        int a = sc.nextInt();
        if(a >= 1 && a % 5 == 0){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
