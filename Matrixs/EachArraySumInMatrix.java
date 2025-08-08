package Matrixs;

import java.util.Arrays;

public class EachArraySumInMatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int k = 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = k;
                k++;

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {

                sum += a[i][j];

            }
            System.out.println("Array" + (i + 1) + ":" + sum);
        }
        System.out.println(Arrays.deepToString(a));

    }
}
