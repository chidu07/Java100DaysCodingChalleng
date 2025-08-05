package arrays;

public class FindSubArryaFromArray {
    public static void main(String[] args) {
        int a[] = { 10, 2030, 40, 50 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");

                }
                System.out.println();
            }
        }
    }
}
