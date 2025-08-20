package strings;

import java.util.Arrays;

public class BubleSortInString {
	public static void bubble_sort(char a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		String s="PentagoneSpace";
		char a[]=s.toCharArray();
		bubble_sort(a);
		System.out.println(Arrays.toString(a));
		

	}

}

