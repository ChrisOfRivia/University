import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 1; i <= 10; i++){
            numbers[i-1] = i;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
