import java.util.Scanner;

public class first_task {

    static int exercise1(int a) {
        int sum = 0;
        String numStr = Integer.toString(a);
        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = exercise1(number);
        System.out.println("The sum of the digits is: " + result);

        sc.close();
    }
}
