package Matrixs;

public class AbsoluteDifferanceOfDiagonalMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,7},{4,6,8},{2,6,9}};
		int l_sum=0,r_sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					l_sum+=a[i][j];
					
					
				}
				if(i+j==a.length-1) {
					r_sum+=a[i][j];
				}
			}
		}
		System.out.println("Absolute sum of diagonals:"+Math.abs(l_sum-r_sum));

	}

}
