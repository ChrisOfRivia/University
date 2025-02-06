public class Ex3 {

    public static int sumElementsArrayRecursive(int[] intArray, int size, int sum){
        if(size > 0){
            sum += intArray[intArray.length - size];
            return sumElementsArrayRecursive(intArray, size-1, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumElementsArrayRecursive(arr, 9, 0));
    }
}
