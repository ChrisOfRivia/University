import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elements = sc.nextLine().split(" ");

        boolean same_elements = false;

        for(int i = 0; i < elements.length - 1; i++){
            if(Arrays.equals(elements[i].toCharArray(), elements[i+1].toCharArray())){
                same_elements = true;
            }
        }

        if(same_elements){
            System.out.println("Array has repeating elements!");
        }
        else{
            System.out.println("Array does NOT have repeating elements!");
        }
    }
}
