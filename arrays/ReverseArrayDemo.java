package arrays;

public class ReverseArrayDemo {
    public static void main(String[] args) {

        int a[] = { 2, 4, 6, 8, 9 };

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

}
