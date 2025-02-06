import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Move an A[N,N] array to an A[N] array, whose elements' squares are greater than 50.\n Sort the A[N] array in height");
        System.out.println("Hristiyan Varbanov 121223233, Group 43");
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();
        int[][] intArray = new int[N][N];
        int counter = 0;

        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++){
                System.out.printf("[%d][%d] -> ", i, j);
                intArray[i][j] = sc.nextInt();
                if(Math.pow(intArray[i][j], 2) > 50){
                    counter++;
                }
            }
        }

        int[] powGr50Array = new int[counter];
        int idx = 0;

        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++){
                if(Math.pow(intArray[i][j], 2) > 50){
                    powGr50Array[idx] = intArray[i][j];
                    idx++;
                }
            }
        }


        System.out.println(Arrays.deepToString(intArray));

        System.out.println(Arrays.toString(powGr50Array));

        for(int i = 0; i < powGr50Array.length - 1; i++){
            for(int j = 0; j < powGr50Array.length - 1; j++){
                if(powGr50Array[j] > powGr50Array[j+1]){
                    int temp = powGr50Array[j];
                    powGr50Array[j] = powGr50Array[j + 1];
                    powGr50Array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(powGr50Array));
    }
}