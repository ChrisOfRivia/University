import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Number of projects: ");
        int projects = sc.nextInt();
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, projects * 3, projects);
        sc.close();
    }
}
