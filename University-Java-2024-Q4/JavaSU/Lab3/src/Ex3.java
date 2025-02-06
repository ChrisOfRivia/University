import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static int biggestNum(int[] numbers){
        int biggestNum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > biggestNum){
                biggestNum = numbers[i];
            }
        }

        return biggestNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str_numbers = sc.nextLine().split(" ");
        int[] numbers = Arrays.stream(str_numbers).mapToInt(Integer::parseInt).toArray();

        System.out.println(biggestNum(numbers));
    }
}
