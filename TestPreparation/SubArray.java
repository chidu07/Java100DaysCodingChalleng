package TestPreparation;

public class SubArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                    sum += a[k];
                }
                System.out.println("sum " + sum);
            }
            System.out.println();
        }
    }
}
