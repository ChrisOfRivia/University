package Second_Exercises;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " ";
        while (true) {
            System.out.print("String: ");
            String new_str = sc.nextLine();
            if(new_str.equals("Stop")){
                break;
            }
            System.out.println(new_str);
        }
        sc.close();
    }
}
