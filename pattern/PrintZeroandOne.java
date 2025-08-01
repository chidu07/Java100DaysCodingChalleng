package pattern;

public class PrintZeroandOne {


    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            // for(int j=1;j<=n-i;j++){
            // System.out.print(" "+" ");
            // }
            for (int j = 1; j <= i; j++) {
                if (k % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
                // System.out.print(k + " ");
                k++;
            }
            // for (int j = i - 1; j >= 1; j--) {
            // System.out.print(j + " ");
            // }
            System.out.println();
        }
    }

}

  
