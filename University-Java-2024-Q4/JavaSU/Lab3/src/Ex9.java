import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elements = sc.nextLine().split(" ");


        for(int i = 0; i < elements.length / 2; i++){
            String temp = elements[i];
            elements[i] = elements[elements.length - i - 1];
            elements[elements.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(elements));
    }
}
