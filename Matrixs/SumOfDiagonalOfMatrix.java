package Matrixs;

import java.util.Arrays;

public class SumOfDiagonalOfMatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int k = 1;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = k;
                k++;

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum += a[i][j];
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
        System.err.println(sum);
    }
}
