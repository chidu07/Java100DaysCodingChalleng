package arrays;

import java.util.Arrays;

//reomve zeros from an array
public class RemoveZeros {
    public static void main(String[] args) {
        int a[] = { 1, 4, 0, 6, 0, 4, 6, 8, 0 };
        Arrays.sort(a);
        int res[] = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != 0 && a[i] != a[i + 1]) {
                res[j++] = a[i];

            }

        }
        res[j++] = a[a.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
