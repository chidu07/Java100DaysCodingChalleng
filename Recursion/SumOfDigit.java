package Recursion;

public class SumOfDigit {
    public static int sumOfDig(int n, int s) {
        if (n == 0) {
            return s;
        }
        return sumOfDig(n / 10, s + n % 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        int s = 0, resm = 0;
        System.out.println(sumOfDig(n, s));

    }

}
