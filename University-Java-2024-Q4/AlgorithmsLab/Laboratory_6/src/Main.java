import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fill up an N*N Array. \n - Fill up a new C[N] array that contains the sum of each row from N*N. \n - Sort the C[N] array.");
        System.out.println("Християн Върбанов 1212232333 43гр.");

        double[][] arr = {
                {5.2,6.1,3.5},
                {0,9.53,6.23},
                {7.1,2.6,1.3}
        };

        double[] C = new double[3];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                C[i] += arr[i][j];
            }
        }

        System.out.println("Sums: ");
        System.out.println(Arrays.toString(C));

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(C[j] > C[j+1]){
                    double temp = C[j];
                    C[j] = C[j + 1];
                    C[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(C));

    }
}