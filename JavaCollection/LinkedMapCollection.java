package JavaCollection;

import java.util.*;

class LinkedMapCollection {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();

        map.put("vishal", 20);
        map.put("rahul", 20);
        map.put("khusal", 20);
        map.put("priyanka", 20);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "" + e.getValue());
        }

    }

}