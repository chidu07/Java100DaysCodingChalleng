package arrays;

import java.util.Arrays;

// 7. Copy one array to another.
public class CopyOneToAnother {
    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 6, 7, 8 };
        int b[] = { 4, 5, 3, 7, 8 };

        int res[] = new int[a.length + b.length];
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            res[j] = a[i];
            j++;

        }
        // int c = res.length;
        for (int i = 0; i < b.length; i++) {
            res[j] = b[i];
            j++;
        }
        System.out.println(Arrays.toString(res));
    }
}
