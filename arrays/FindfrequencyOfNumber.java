package arrays;

import java.util.HashMap;
import java.util.Map;

//Find the frequency of each element in an array.
public class FindfrequencyOfNumber {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 6, 3, 2, 6, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

}
