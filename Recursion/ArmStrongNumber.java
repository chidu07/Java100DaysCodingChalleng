

public class ArmStrongNumber {
	public static int count_dig(int n,int c) {
		if(n==0) {
			return c;
		}
		return count_dig(n/10, c+1);
		
	}
	public static int arm_dig(int n,int s,int dig) {
		if(n==0) {
			return s;
		}
		return arm_dig(n/10,s+(int)Math.pow(n%10, dig),dig);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=152;
		int c=0;
		int dig=count_dig(n, c);
//		System.out.println(dig);
		int res=arm_dig(n, 0, dig);
		if(res==n) {
			System.out.println("Arm strong number");
		}
		else {
			System.out.println("Its not");
		}

	}

}
