import java.util.Scanner;

public class second_task {

    static void exercise2(int a, int b){
        System.out.printf("Initial numbers: A(%d) | B(%d) \n", a, b);
        System.out.printf("A(%d) + B(%d) = %d \n", a, b, a+b);
        a += b;
        System.out.printf("A(%d) - B(%d) = %d \n", a, b, a-b);
        b = a - b;
        System.out.printf("A(%d) - B(%d) = %d \n", a, b, a-b);
        a -= b;
        System.out.printf("Numbers after: A(%d) | B(%d) \n", a, b);
    }


    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for A: ");
        a = sc.nextInt();
        System.out.print("Enter number for B: ");
        b = sc.nextInt();
        exercise2(a, b);
        sc.close();
    }
}
