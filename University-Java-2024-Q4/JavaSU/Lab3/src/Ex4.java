import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summer = 0;

        String[] str_numbers = sc.nextLine().split(" ");
        int[] numbers = Arrays.stream(str_numbers).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < numbers.length; i++){
            summer += numbers[i];
        }

        System.out.println(summer);
    }
}
