public class FirstFiptyPrimeNumber {
    public static int findFactor(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;

            }
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 7;
        int k = 0;
        for (int i = 1;; i++) {
            int count = findFactor(i);

            if (count == 2) {
                System.out.println(i);
                k++;
            }
            if (k == 10) {
                break;
            }
        }

    }
}
