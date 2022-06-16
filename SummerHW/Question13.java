import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number :");
		int n=sc.nextInt();
		
		if(n%10 == 0) {
			System.out.println("Not a Duck Number ");
			System.exit(0);
		}
		else {
			boolean check=false;
			for( ;n!=0; n=n/10) {
				int d=n%10;
				if(d==0) {
					check=true;
					break;
				}
			}
			if(check) {
				System.out.println("This is Duck Number ");
			}
			else {
				System.out.println("This is not a Duck Number ");
			}
		}
	}
}