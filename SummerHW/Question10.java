public class Question10 {

	static boolean palindrome(int integer) {
		int clone=integer;int reverse=0;
		while(integer!=0) {
			int digit=integer%10;
			reverse=reverse*10+digit;
			integer=integer/10;
		}
		return clone==reverse;
	}

	static boolean prime(int integer) {
		if(integer==1) {
			return false;
		}
		for(int i=2;i<=integer/2;i++) {
			if(integer%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(palindrome(i) && prime(i)) {
				System.out.println(i);
			}
		}
	}
}