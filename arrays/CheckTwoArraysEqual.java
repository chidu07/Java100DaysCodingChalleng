package arrays;

public class CheckTwoArraysEqual {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 7, 8 };
        int b[] = { 2, 4, 6, 7, 8 };
        boolean flag = true;
        if (a.length != b.length) {
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                flag = false;
            }

        }
        if (flag) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");

        }
    }
}
