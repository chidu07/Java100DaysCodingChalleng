public class CountDig {
    // public static int countDig(int n) {
    // int c = 0;
    // while (n != 0) {
    // n /= 10;
    // c++;
    // }
    // return c;
    // }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 182;
        while (n >= 10) {

            n = sumDigit(n);
        }

        System.out.println(n);
    }

}