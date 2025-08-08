package Matrixs;

import java.util.Arrays;
import java.util.Scanner;

public class DifferanceOfTwoDiagnalsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];

        int sum1 = 0;
        int sum2 = 0;
        System.err.println("enter element:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum1 += a[i][j];
                }
                if (i == a[i].length - 1 - i) {
                    sum2 += a[i][j];
                }

            }
        }
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // if (i == a[i].length - 1 - i) {
        // sum2 += a[i][j];
        // }

        // }
        // }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
        System.err.println(sum1);
        System.err.println(sum2);
        System.out.println("Differance Between Diagonals:" + (sum1 - sum2));
    }
}
