public class StrongNumber {
    public static int findFact(int n) {
        if (n < 2) {
            return 1;
        }

        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;

    }

    public static void main(String[] args) {

        int n = 34;
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            int res = findFact(rem);
            sum = sum + res;

            n /= 10;

        }
        if (sum == temp) {
            System.out.println("Its strong or krishnamurthy number");

        } else {
            System.out.println("Its not");
        }

    }
}
