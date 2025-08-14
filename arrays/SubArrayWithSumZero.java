package arrays;

import java.util.Arrays;

public class SubArrayWithSumZero {

	public static void main(String[] args) {
		// int a[]= {21,-15,-22,5,9,-34};
		// int l=3;
		// int max=Integer.MIN_VALUE;
		// for(int i=0;i<a.length;i++) {
		// for(int j=i;j<a.length;j++) {
		//
		// if(j-i+1==l ) {
		// int sum=0;
		// for(int k=i;k<=j;k++) {
		//
		// System.out.print(a[k]+" ");
		// sum+=a[k];
		//
		// }
		//
		//
		// if(sum>max) {
		// max=sum;
		// }
		// System.out.println("Sum:"+sum);
		// System.out.println();
		// }
		// }
		// }

		///////////////////////////////////////////////////
		// Or

		int a[] = { 3, 4, -7, 3, 1, 3, 1, -4 };

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {

				// System.out.print(a[k]+" ");
				sum += a[j];

				if (sum == 4) {
					int[] sub = Arrays.copyOfRange(a, i, j + 1);

					System.out.println(Arrays.toString(sub));
				}
				// System.out.println("Sum:"+sum);

			}
		}

	}

}
