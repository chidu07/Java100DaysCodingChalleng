package arrays;

public class MissingElementnArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 8 };
        int n = a.length;
        int total = (n + 1) * (n + 2) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Missing no:" + (total - sum));
    }
}
