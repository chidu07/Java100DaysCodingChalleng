package strings;


public class LogestPalindromicSubString {
	public static String reverse_String(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res+=s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		String s="malayalam";
		int max=Integer.MIN_VALUE;
		String l_string="";
		
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String res="";
				
				for(int k=i;k<=j;k++) {
					res+=s.charAt(k);
				}
				
				if(res.equals(reverse_String(res))) {
					if(res.length()>max) {
						l_string=res;
						max=res.length();
					}
					
//					System.out.println(res);
				}
			}
			
		}
		System.out.println(l_string);
		System.out.println("Max lenth:"+max);

	
	

	
//	public static String reverse_String(String s) {
//		String res="";
//		for(int i=s.length()-1;i>=0;i--) {
//			res+=s.charAt(i);
//		}
//		return res;
//	}
//
//	public static void main(String[] args) {
//		String s="malayalam";
//		int max=Integer.MIN_VALUE;
//		String l_string="";
//		
//		for(int i=0;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//				String res="";
//				int l=0;
//				for(int k=i;k<=j;k++) {
//					res+=s.charAt(k);
//					l++;
//				}
//				if(max<l) {
//					max=l;
//				
//				if(res.equals(reverse_String(res))&& max>=l) {
//					l_string=res;
//					
//					}
//					
//				}
//		}
//			
//		}
//		System.out.println(l_string);
//		System.out.println("Max lenth:"+max);

}
}
