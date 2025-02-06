package Test;

public class ByRefTest {
    public static void main(String[] args) {
        ByRef<Integer> a = new ByRef<>(10);
        changeValue(a);

        System.out.println(a.getValue());
    }

    public static void changeValue(ByRef a){
        a.setValue(15);
    }
}
