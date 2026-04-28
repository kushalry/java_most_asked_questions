package iterate_arrayList_using_many_ways;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // Using for-each loop
        for (String str : list) {
            System.out.println(str);
        }

        // Using traditional for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Using Java 8 forEach method
        list.forEach(System.out::println);
    }
}
