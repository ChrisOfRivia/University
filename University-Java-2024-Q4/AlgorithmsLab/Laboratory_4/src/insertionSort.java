import java.util.Arrays;

public class insertionSort {

    public static void insertSort(int[] intArray){
        System.out.println("Original Array: " + Arrays.toString(intArray));
        int MIN, minIdx;
        for(int i = 0; i < intArray.length; i++){
            MIN = intArray[i];
            minIdx = i;

            for(int j = i+1; j < intArray.length; j++){
                if(MIN > intArray[j]){
                    MIN = intArray[j];
                    minIdx = j;
                }
            }

            intArray[minIdx] = intArray[i];
            intArray[i] = MIN;
        }
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void main(String[] args) {;
        int[] unsortedArray = {6, 3, 4, 56, 6, 7, 8, 1};
        insertSort(unsortedArray);

    }
}
