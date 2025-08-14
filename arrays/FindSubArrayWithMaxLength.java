package arrays;

import java.util.Arrays;

public class FindSubArrayWithMaxLength {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 3, 5, 1, 2, 1, 7, 8 };
        int k = 3;
        int ml = 0;
        int res[] = {};
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {

                sum += a[j];
                if (sum == k) {
                    if (ml < j - i + 1) {
                        ml = j - i + 1;
                        res = Arrays.copyOfRange(a, i, j + 1);
                    }
                }

            }
        }
        System.out.println(Arrays.toString(res));
    }
}
