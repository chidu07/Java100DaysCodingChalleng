package TestPreparation;

public class Dem1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n + 1 - i; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int j = n - 1; j >= n + 1 - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n + 1 - i; j <= n; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            for (int j = n - 1; j >= n + 1 - i; j--) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }
}
