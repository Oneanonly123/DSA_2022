package JavaCollection;

import java.util.*;

class SetClass {
    public static void main(String[] args) {
        // Creating an object of Set and
        // declaring object of type String

        // LinkedHashSet Maintain the order
        Set<String> hs = new LinkedHashSet<String>();

        // HashSet doesn't maintain the order
        // Set<String> hs1 = new HashSet<String>();

        // Maintain the order and arrange in sorted ascending order
        // Set<String> hs2 = new TreeSet<String>();

        // Adding elements to above object
        // using add() method
        hs.add("2");
        hs.add("1");
        hs.add("9");
        hs.add("8");

        System.out.println(hs.contains("1"));

        for (String value : hs) {
            System.out.println("Value is: " + value);
        }

        Iterator<String> val = hs.iterator();

        while (val.hasNext()) {
            System.out.println(val.next());
        }

        // Printing the elements inside the Set object
        System.out.println(hs);
    }
}