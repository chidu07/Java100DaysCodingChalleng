
public class toUpperCasemethodDemo {
	public static String convert_upper(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=97 && ch<=122) {
				res+=(char)(ch-32);
				
			}
			else {
				res+=ch;
			}
		}
		return res;
	}
	public static String convert_lower(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				res+=(char)(ch+32);
				
			}
			else {
				res+=ch;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s="Pentgon Space";
		String upper_res=convert_upper(s);
		String lower_res=convert_lower(s);
		System.out.println(upper_res);
		System.out.println(lower_res);

	}

}

