package arrays;

import java.util.Arrays;

public class MergeSortAlgo {
    public static int[] merge(int a[], int b[], int c[]) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;

        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;

        }
        return c;

    }

    public static int[] divide(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        left = divide(left);
        right = divide(right);
        return merge(right, left, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 100, 40, 30, 20, 60, 70, 50, 10 };
        int res[] = divide(arr);
        System.out.println(Arrays.toString(res));

    }
}
