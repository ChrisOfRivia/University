package First_Exercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a);
        }
        else if(b > a){
            System.out.println(b);
        }
        else{
            System.out.println("Same number");
        }
        sc.close();
    }
}
