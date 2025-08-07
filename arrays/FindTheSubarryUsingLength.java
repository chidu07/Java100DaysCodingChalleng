package arrays;

public class FindTheSubarryUsingLength {
    public static void main(String[] args) {
        int a[] = { 30, 60, 20, 10, 80 };
        int max = Integer.MIN_VALUE;
        int l = 2;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (j - i + 1 == l) {
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += a[k];
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

