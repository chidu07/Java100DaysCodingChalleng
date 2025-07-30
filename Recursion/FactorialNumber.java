package Recursion;

public class FactorialNumber {
    public static int findFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int res = findFact(n);
        System.out.println(res);
    }
}
