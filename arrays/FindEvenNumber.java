package arrays;

// Find the difference between the sum of even and odd indexed elements.
public class FindEvenNumber {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 5, 8, 7, 8, 12, 9, 10 };
        int even_sum = 0, odd_sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 1 && a[i] % 2 == 0) {

                odd_sum++;
            }
            if (i % 2 == 0 && a[i] % 2 == 0) {
                even_sum++;
            }
        }
        System.out.println(even_sum - odd_sum);

    }
}
