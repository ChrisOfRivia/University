package Second_Exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int a = sc.nextInt();
        int maxNum = 0;
        int minNum = 0;

        for(int i = 0; i < a; i++){
            System.out.printf("[%d] Number: ", i+1);
            int num = sc.nextInt();
            if(i == 0){
                maxNum = num;
                minNum = num;
            }

            if(num > maxNum){
                maxNum = num;
            }
            if(num < minNum){
                minNum = num;
            }

        }
        System.out.println("Lowest number: "+minNum);
        System.out.println("Biggest number: "+maxNum);
        sc.close();
    }
}
