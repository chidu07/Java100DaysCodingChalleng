package strings;


public class MakeThefirstLtterCaps {
	public static String make_Caps(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((i==0 &&(ch>=97 && ch<=122)) ||(i==s.length()-1 &&(ch>=97 && ch<=122))) 
					{
				char nchar=(char)(s.charAt(i)-32);
				 res +=nchar;
			}
			else {
				res+=s.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s="India is my country";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(make_Caps(arr[i])+" ");
			
		}
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(reverse_string(arr[i])+" ");
//		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(reverse_string(arr[i])+" ");
//		}

	}

}
