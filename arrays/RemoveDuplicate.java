package arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 6, 3, 5, 6, 7, 8 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int res[] = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                res[j] = a[i];
                j++;

            }
        }
        res[j++] = a[a.length - 1];

        // System.out.println(Arrays.toString(res));

        for (int i = 0; i < j; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
