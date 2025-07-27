package arrays;

public class CheckPalindrome {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 1 };
        int start = 0;
        int end = a.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (a[start] != a[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
