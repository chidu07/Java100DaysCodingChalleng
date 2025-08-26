

public class SubStingWithoutUsingSubMethod {

	public static void main(String[] args) {
		String s="Hello";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String res="";
				for(int k=i;k<=j;k++) {
					res+=s.charAt(k);
				}
				System.out.println(res);
			}
			System.out.println();
		}
	}

}

