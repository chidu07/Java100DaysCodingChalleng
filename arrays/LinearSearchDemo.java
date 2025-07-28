package arrays;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int ele = 4;
        for (int i = 0; i < a.length; i++) {
            if (ele == a[i]) {
                System.out.println("element finded at the position:" + (i + 1));
                break;
            }
        }
    }
}
