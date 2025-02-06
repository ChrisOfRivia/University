import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split(" ");

        Arrays.sort(strings, (a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println(Arrays.toString(strings));
    }
}
