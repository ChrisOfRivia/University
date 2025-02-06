public class Ex1 {

    public static String turnDecIntoBin(int a, String emptyString){
        if(a>0){
            emptyString += String.valueOf(a % 2);
            return turnDecIntoBin(a/2, emptyString);
        }
        String zeros = "";
        while((emptyString.length() + zeros.length()) < 4){
            zeros += 0;
        }
        return zeros + emptyString;
    }

    public static void main(String[] args) {
        System.out.println(Ex1.turnDecIntoBin(87, ""));
    }
}