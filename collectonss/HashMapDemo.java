package collectonss;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 2, 5, 7, 6 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : a) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);

            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
        System.out.println("after Removing  duplicates");
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
        System.out.println("print only duplicates  duplicates");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
        System.out.println("print ferquency of digit using entrySet()");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ->" + entry.getValue() + " ");
            }
        }

    }

}
