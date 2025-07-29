package arrays;

import java.util.Arrays;

public class ClockWiseRotationOfArray {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
        System.err.println(Arrays.toString(a));
    }
}
