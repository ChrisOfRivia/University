import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class fourth_task {

    public static int[] turn_arr_str_to_arr_int(String[] list){
        int[] newIntArr = new int[list.length];

        for(int i = 0; i < list.length; i++){
            try{
                newIntArr[i] = parseInt(list[i]);
            }catch(Exception e){
                System.out.println("No letters");
                break;
            }

        }

        return newIntArr;
    }

    public static String pair(int a, int b){
        return "(" + a + ", " + b + ")";
    }

    public static void print_pairs(int[] list_nums){
        ArrayList<String> pairsArr = new ArrayList<>();
        for(int i = 0; i < list_nums.length - 1; i++){
            if(list_nums[i] < 0 && list_nums[i + 1] > 0 || list_nums[i] > 0 && list_nums[i+1] < 0){
                pairsArr.add(pair(list_nums[i], list_nums[i+1]));
            }
        }
        System.out.println(pairsArr);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] newStrArr = scanner.nextLine().split(" ");
        scanner.close();
        int[] transformedIntArr = turn_arr_str_to_arr_int(newStrArr);
        print_pairs(transformedIntArr);

    }
}
