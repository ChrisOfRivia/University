package Third_Exercises;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.print("K: ");
        int k = sc.nextInt();

        int factorial_n = 1;
        int factorial_k = 1;
        int factorial_nk = 1;

        for(int i = 1; i <= n; i++){
            factorial_n *= i;
        }
        for(int j = 1; j <= k; j++){
            factorial_k *= j;
        }

        for(int o = 1; o < n-k; o++){
            factorial_nk *= o;
        }

        System.out.printf("%d!*%d!/(%d-%d)! = %d", n, k, n, k, (factorial_n * factorial_k)/(factorial_nk));
    }
}
