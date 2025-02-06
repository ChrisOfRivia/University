package Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Person, String> personStringMap = new HashMap<>();
        personStringMap.put(new Person(10, "A"), "A");

        // Override .equals() and hashMap in Person method for this to work
        System.out.println(personStringMap.get(new Person(10, "A")));
    }





}
