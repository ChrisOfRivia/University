package Third_Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0;
        while (true) {
            System.out.print("Number % 10 = 0: ");
            int new_int = sc.nextInt();
            if(new_int % 10 == 0){
                break;
            }
            System.out.println("Wrong");
        }
        sc.close();
    }
}
