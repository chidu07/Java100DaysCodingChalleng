

public class CountDigit {
	public static int countDig(int n,int count) {
		if(n==0) {
			return count;
		}
		return countDig(n/10, count+1);
	}

	public static void main(String[] args) {
		int n=123;
		int count=0;
		int res=countDig(n,count);
		System.out.println(res);

	}

}
