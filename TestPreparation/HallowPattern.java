package TestPreparation;

public class HallowPattern {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || i == j || j == n || n + 1 - i == j || i == n / 2 + 1
                        || j == n / 2 + 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }
}
