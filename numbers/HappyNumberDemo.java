public class HappyNumberDemo {
    public static int find_Happy_number(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem * rem;
            n /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1;
        int res = find_Happy_number(n);
        while (res != 1 && res != 4) {
            res = find_Happy_number(res);

        }
        if (res == 1) {
            System.out.println("Happyy number");
        } else {
            System.out.println("Its not");
        }
    }
}
