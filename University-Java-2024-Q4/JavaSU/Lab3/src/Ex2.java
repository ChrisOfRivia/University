import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int median = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            numbers[i] = num;
            median += num;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(median / 5);
    }
}
