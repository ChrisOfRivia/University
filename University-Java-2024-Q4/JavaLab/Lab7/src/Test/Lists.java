package Test;

import java.util.*;

public class Lists {
    public static void main(String[] args) {

        // List/Queue are interfaces, they implement ArrayList and LinkedList
        List<Integer> list = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        list.add(10);
        System.out.println(list.get(0));
        System.out.println(list.indexOf(10));

        // Map -> Dictionary

        Map<Integer, String> map = new HashMap<>();

        map.put(5, "five");
        System.out.println(map.get(5));
    }
}
