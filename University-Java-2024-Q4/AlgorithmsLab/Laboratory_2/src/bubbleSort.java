public class bubbleSort {
    public int[] bubbleSort(int[] intArr){
        int temp = 0;
        for(int i = 0; i < intArr.length - 1; i++){
            if(intArr[i] > intArr[i + 1]){
                temp = intArr[i];
                intArr[i] = intArr[i + 1];
                intArr[i + 1] = temp;
            }
        }
        return intArr;
    }
    public static void main(String[] args) {

    }
}
