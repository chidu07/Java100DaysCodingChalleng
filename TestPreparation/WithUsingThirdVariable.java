package TestPreparation;

public class WithUsingThirdVariable {
    public static void main(String[] args) {
        int n = 5;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = k + i;
            int t = k;
            for (int j = 1; j <= i; j++) {
                System.out.print(t + " ");
                t--;

            }
            System.out.println();
        }
    }
}
