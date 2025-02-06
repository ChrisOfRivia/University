public class Ex4 {

    public static boolean checkForNumInInteger(String number, int checkNumber, int length){
        if(Integer.parseInt(String.valueOf(number.charAt(length - 1))) == checkNumber){
            return true;
        } else if (length == 1) {
            return false;
        }
        return checkForNumInInteger(number, checkNumber, length-1);
    }

    public static void main(String[] args) {
        System.out.println(checkForNumInInteger("2134", 2, 4));
    }
}
