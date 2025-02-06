import java.util.ArrayList;
import java.util.Arrays;



public class Ex1 {
    public class Pair {
        public static String pair(int a, int b){
            return "(" + Integer.toString(a) + ", " + Integer.toString(b) + ")";
        }
    }

    public static int sumMainDiag(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i][i];
        }
        return sum;
    }

    public static int[] sumElementsRows(int[][] arr){

        int[] sumRows = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sumRows[i] += arr[i][j];
            }
        }
        return sumRows;
    }

    public static int numElementsBelowMainDiagLessThanSumIndexes(int[][] arr){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i > j && arr[i][j] < (i + j)){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int sumCounterDiag(int[][] arr){
        int num = arr.length - 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(j == num){
                    sum += arr[i][j];
                    num--;
                }
            }
        }
        return sum;
    }



    public static ArrayList<String> pairsSymmetricalIndexes(int[][] arr){
        ArrayList<String> pairs = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i > j){
                    pairs.add(Pair.pair(arr[i][j], arr[j][i]));
                }

            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},   //00 01 02
                {4, 5, 6},   //10 11 12
                {1, 2, 3}};  //20 21 22
        // sum elements main diagonal
        int sumMainDiag = sumMainDiag(arr);
        System.out.println("Sum of main diagonal -> " + sumMainDiag);
        System.out.println("--------");
        // sum elements each row
        int[] sumRows = sumElementsRows(arr);
        System.out.println("Sum of rows -> " + Arrays.toString(sumRows));
        System.out.println("--------");
        // num elements below main diag < sum indexes
        int numEl = numElementsBelowMainDiagLessThanSumIndexes(arr);
        System.out.println("Number of elements less than sum of their indexes -> " + numEl);
        System.out.println("--------");
        // sum elements counter diagonal
        int sumCounterDiag = sumCounterDiag(arr);
        System.out.println("Sum of counter diagonal -> " + sumCounterDiag);
        System.out.println("--------");
        // group elements on symmetrically based on main diagonal
        ArrayList<String> pairSymmIndexes = pairsSymmetricalIndexes(arr);
        System.out.println("Pairs symmetrical indexes -> " + pairSymmIndexes.toString());
        System.out.println("--------");
    }
}

