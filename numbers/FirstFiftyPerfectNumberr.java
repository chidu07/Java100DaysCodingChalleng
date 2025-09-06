// Source code is decompiled from a .class file using FernFlower decompiler.


public class FirstFiftyPerfectNumberr {
   public FirstFiftyPerfectNumberr() {
   }

   public static boolean isPerfect(int n) {
      int sum = 0;

      for(int i = 1; i < n; ++i) {
         if (n % i == 0) {
            sum += i;
         }
      }

      if (sum == n) {
         return true;
      } else {
         return false;
      }
   }

   public static void main(String[] args) {
      int n = 1000;
      int sum = false;

      for(int i = 1; i <= n; ++i) {
         if (isPerfect(i)) {
            System.out.println(i);
         }
      }

   }
}
