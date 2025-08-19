package strings;

public class StringLetterConversion {


	public static void main(String[] args) {
		String s1="ABDEF";
		String res="";
		String ans="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			res+=s1.charAt(i);
			
		}
		System.out.println(res);
		for(int i=0;i<res.length();i++) {
//			ans+=res.charAt(i)+1;
			System.out.print((char)(res.charAt(i)+1));
		}
//		System.out.println(ans);
		

	}

}
