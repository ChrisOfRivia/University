import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");

        System.out.print("Ask for an element: ");
        String element = sc.nextLine();

        boolean foundElement = false;

        for(int i = 0; i < strings.length; i++){
            if(Arrays.equals(strings[i].toCharArray(), element.toCharArray())){
                System.out.println("Element is at index: " + i);
                foundElement = true;
            }
        }

        if (!foundElement){
            System.out.println("Element was not found!");
        }
    }
}
