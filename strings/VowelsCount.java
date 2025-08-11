package strings;



public class VowelsCount {

	public static void main(String[] args) {
		String s1="PEntagon   @%12";
		int v_count=0;
		int s_count=0;
		int c_count=0;
		int sp_count=0;
		int n_count=0;
		s1=s1.toLowerCase();
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if((ch>=65 && ch<=90)||(ch>=97 && ch<=122 )|| ch==32) {
			if(ch=='a' || ch=='i' || ch=='o'|| ch=='e' || ch=='u') {
				v_count++;
			}
			else if(ch==' ') {
				s_count++;
			}
			else {
				c_count++;
			}
			}
			else {
				if(ch>=48 && ch<=57) {
					n_count++;
				}
				else {
				sp_count++;
				}
			}
		}
		System.out.println("Vowel Count:"+v_count);
		System.out.println("Constant Count:"+c_count);
		System.out.println("Space Count:"+s_count);
		System.out.println("Special Charecter Count:"+sp_count);
		System.out.println("Numbers Count:"+n_count);

	}

}

