import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(Arrays.equals(arr1[i].toCharArray(), arr2[j].toCharArray())){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
