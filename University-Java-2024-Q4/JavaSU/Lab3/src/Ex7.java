import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split(" ");
        int[] numbers = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

        int positive = 0;
        int negative = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                positive++;
            }
            else if(numbers[i] < 0){
                negative++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
