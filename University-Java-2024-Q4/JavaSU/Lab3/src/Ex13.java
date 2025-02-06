import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String[] strNumbers = sc.nextLine().split(" ");
        int[] originalNumbers = Arrays.stream(strNumbers).mapToInt(Integer::parseInt).toArray();
        int[] copyNumbers = Arrays.copyOf(originalNumbers, originalNumbers.length);


        // From Ex9
        for(int i = 0; i < copyNumbers.length / 2; i++){
                    int temp = copyNumbers[i];
                    copyNumbers[i] = copyNumbers[copyNumbers.length - i - 1];
                    copyNumbers[copyNumbers.length - i - 1] = temp;
        }

        if(Arrays.equals(originalNumbers, copyNumbers)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not palindrome!");
        }
    }
}
