package Strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Patterns implements Moveable {
    public static void main(String[] args) throws IncorrectChessNotationException {
        ArrayList<String> correct_patterns = new ArrayList<String>();
        // String[] patterns = {"Qxd4", "e4", "Nf6","d4","exxcc554", "exd5", "Bxd7#", "f6", "Bb4+"};
        Pattern pattern = Pattern.compile("^[QRBKNa-h]?x?[a-h][1-9]\\+?|#?");
        Test moveable = new Test();
        
        Scanner sc = new Scanner(System.in);
        String[] user_patterns = sc.nextLine().split(" ");
        for (String s : user_patterns) {
            try{
                moveable.move(pattern, s);
                correct_patterns.add(s);
            }catch (IncorrectChessNotationException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(correct_patterns);
        sc.close();
    }
}
