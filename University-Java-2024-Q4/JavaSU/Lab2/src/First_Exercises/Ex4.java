package First_Exercises;

import java.util.Objects;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week: ");
        String day = sc.nextLine();
        if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            System.out.println("Working day");
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Error");
        }
        sc.close();
    }
}
