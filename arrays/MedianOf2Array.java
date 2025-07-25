package arrays;

//Find the median of two sorted arrays. 
public class MedianOf2Array {
    public static void main(String[] args) {

        int a[] = { 1, 3, 5 };
        int b[] = { 10, 4, 6 };
        int n = a.length;
        int m = b.length;
        int s1 = 0, s2 = 0;

        for (int i = 0; i < n; i++) {
            s1 += a[i];

        }
        for (int i = 0; i < m; i++) {
            s2 += b[i];

        }
        // System.out.println(s1 + " " + s2);
        int ns1 = s1 / n;
        int ns2 = s2 / m;
        // System.out.println(ns1 + ns2);
        double res = (double) (ns1 + ns2) / 2;
        System.out.println(res);
    }
}
