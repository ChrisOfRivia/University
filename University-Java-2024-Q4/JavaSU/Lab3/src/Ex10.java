import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        System.out.print("Element to remove: ");
        String element = sc.nextLine();

        while(true){
            for(int i = 0; i < array.length; i++){
                if(Arrays.equals(array[i].toCharArray(), element.toCharArray())){
                    int indexMatch = Arrays.binarySearch(array, array[i]);
                    for(int j = indexMatch; j < array.length - 1; j++){
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                    array = Arrays.copyOfRange(array, 0, array.length - 1);
                }
            }
            int counter = 0;
            for (String s : array) {
                if (Arrays.equals(s.toCharArray(), element.toCharArray())) {
                    counter ++;
                }
            }
            if(counter == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
