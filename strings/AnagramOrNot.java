package strings;


import java.util.Arrays;

public class AnagramOrNot {
	public static String convert_lower(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				res+=(char)(ch+32);
				
			}
			else {
				res+=ch;
			}
		
	}
		return res;
	}
	public static char[] convert_Chararray(String s) {
		char res[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			res[i]=s.charAt(i);
			
	}
		return res;
	}
	public static char[] bubble_sort(char a1[]) {
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length-1;j++) {
				if(a1[j]>a1[j+1]) {
					char temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
		return a1;
	}
	
	public static boolean compare_Chararray(char a1[],char a2[]) {
		if(a1.length!=a2.length) {
			return false;
		}
		for(int i=0;i<a1.length;i++) {
			if(a1[i]!=a2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1="Cat";
		String s2="tac";
		String a=convert_lower(s1);
		String b=convert_lower(s2);
		System.out.println(a);
		char a1[]=convert_Chararray(a);
		char a2[]=convert_Chararray(b);
		
		char [] b1=bubble_sort(a1);
		char [] b2=bubble_sort(a2);
//		a1=bubble_sort(a1);
//		a2=bubble_sort(a2);
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		
		boolean flag=compare_Chararray(a1,a2);
		System.out.println(flag);
		if(flag) {
			System.out.println("Its Anagram");
		}
		else {
			System.out.println("Its not");
		}
	}

}
