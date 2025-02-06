import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        ArrayList<String> obedinenie = new ArrayList<>();
        ArrayList<String> presichane = new ArrayList<>();


        for(int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Arrays.equals(arr1[i].toCharArray(), arr2[j].toCharArray()) && !presichane.contains(arr1[i])) {
                    presichane.add(arr1[i]);
                }
            }
        }
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(!presichane.contains(arr1[i]) && !obedinenie.contains(arr1[i])){
                    obedinenie.add(arr1[i]);
                }
                if(!presichane.contains(arr2[j]) && !obedinenie.contains(arr2[j])){
                    obedinenie.add(arr2[j]);
                }
            }
        }
        System.out.println(presichane);
        System.out.println(obedinenie);
    }
}
