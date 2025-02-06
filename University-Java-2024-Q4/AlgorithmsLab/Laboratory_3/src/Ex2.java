public class Ex2 {

    public static int xnRecursion(int x, int n){
        if(n > 0){
            return x * xnRecursion(x, n - 1);
        } else if (n < 0) {
            return 1 / xnRecursion(x, -n);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(xnRecursion(2, 3));
    }
}
