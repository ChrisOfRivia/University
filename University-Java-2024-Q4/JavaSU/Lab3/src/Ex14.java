import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = sc.nextLine().split(" ");
        int[] numArray = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();

        System.out.print("How many times to rotate forward: ");
        int k = sc.nextInt();

        for(int j = 1; j <= k; j++){
            for(int i = numArray.length - 1; i > 0; i--){
                int temp = numArray[i];
                numArray[i] = numArray[i - 1];
                numArray[i - 1] = temp;
            }
            System.out.println("["+j+"] -> " + Arrays.toString(numArray));
        }

        System.out.println(Arrays.toString(numArray));;
    }
}
