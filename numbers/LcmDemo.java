

public class LcmDemo {

	public static void main(String[] args) {
		int a=7,b=5;
		int max=(a>b)?a:b;
		for(int i=max;;i++) {
			if(i%a==0 && i%b==0) {
				System.out.println("LCM:"+i);
				break;
			}
		}

	}

}
