package arrays;

import java.util.Arrays;

public class CopyOneToArray {
    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 6, 7, 8 };
        int res[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
