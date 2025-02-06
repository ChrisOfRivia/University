package Third_Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // time after 15 min
        Scanner sc = new Scanner(System.in);
        System.out.print("Hours: [0-23] ");
        int hours = sc.nextInt();

        System.out.print("Minutes: [0-59] ");
        int min = sc.nextInt();

        int all_mins = (hours * 60) + min + 15;
        int hours_later = (all_mins / 60) % 24;
        int minutes_later = all_mins % 60;

        System.out.printf("[%02d:%02d]", hours_later, minutes_later);
        sc.close();
    }
}
