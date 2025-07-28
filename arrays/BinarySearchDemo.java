package arrays;

public class BinarySearchDemo {
    public static int binarySearch(int a[], int ele) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int m = (low + high) / 2;
            if (ele == a[m]) {
                return m;

            } else if (ele > a[m]) {
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 7, 9 };
        int ele = 9;
        int res = binarySearch(a, ele);
        if (res >= 0) {
            System.out.println("element find at the position:" + (res + 1));
        } else {
            System.out.println("not found");
        }

    }
}
