import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strNumbers = sc.nextLine().split(" ");
        int[] intNumbers = Arrays.stream(strNumbers).mapToInt(Integer::parseInt).toArray();

        while(true){
            for(int i = 0; i < intNumbers.length - 1; i++){
                if(intNumbers[i] > intNumbers[i+1]){
                    int temp = intNumbers[i + 1];
                    intNumbers[i + 1] = intNumbers[i];
                    intNumbers[i] = temp;
                }
            }
            int counter = 0;
            for(int j = 0; j < intNumbers.length - 1; j++){
                if(intNumbers[j] > intNumbers[j + 1]){
                    counter++;
                }
            }
            if(counter == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(intNumbers));
        System.out.println(intNumbers[intNumbers.length - 2]);
    }
}
