import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radians: ");
        float rad = sc.nextFloat();
        float deg = Math.round((rad * 180) / Math.PI);
        System.out.printf("%.2f Radians -> %.2f Degrees", rad, deg);
        sc.close();
    }
}
