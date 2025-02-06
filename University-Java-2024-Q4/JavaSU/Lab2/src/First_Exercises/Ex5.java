package First_Exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number [-100;100] != 0: ");
        int a = sc.nextInt();
        if(a >= -100 && a <= 100 && a != 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }
}
