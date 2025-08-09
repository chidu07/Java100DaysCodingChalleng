package Matrixs;

public class MaxInMatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int k = 1;
        int max = a[0][0];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = k;
                k++;

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
                if (min > a[i][j]) {
                    min = a[i][j];
                }

            }

        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}
