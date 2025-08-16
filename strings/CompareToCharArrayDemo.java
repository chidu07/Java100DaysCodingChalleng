package strings;



public class CompareToCharArrayDemo {
	public static boolean compare_array(char a1[],char a2[]) {
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
		String s1="Hello";
		String s2="hello";
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		boolean flag=compare_array(a1, a2);
		if(flag) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Its not");
		}

	}

}

