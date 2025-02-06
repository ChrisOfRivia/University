package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Moveable{
    default void move(Pattern regex, String str) throws IncorrectChessNotationException {
        Matcher matcher1 = regex.matcher(str);
        if(!matcher1.matches()){
            throw new IncorrectChessNotationException(str + " is an incorrect chess move!");
        }
    }
}
