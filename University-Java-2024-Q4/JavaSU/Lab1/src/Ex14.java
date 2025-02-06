import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num pages of book: ");
        int whole_book_pages = sc.nextInt();
        System.out.print("Pages Joro can read for 1 hour: ");
        float pages_an_hour = sc.nextFloat();
        System.out.print("Days remaining: ");
        int days_remaining = sc.nextInt();
        System.out.printf("Joro needs to read for %.2f hour/s a day!", (whole_book_pages / pages_an_hour) / days_remaining);
        sc.close();
    }
}
