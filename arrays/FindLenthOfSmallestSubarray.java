package arrays;

public class FindLenthOfSmallestSubarray {
    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 2, 4, 3 };
        int k = 2;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                int sum = 0;
                int length = 0;
                for (int x = i; x <= j; x++) {
                    sum += a[x];
                    length++;
                }
                if (k <= sum && (j - i + 1) < min) {
                    min = j - i + 1;

                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("No subarray found");
        } else {
            System.out.println("Length of smallest continuous subarray: " + min);
        }
    }
}
