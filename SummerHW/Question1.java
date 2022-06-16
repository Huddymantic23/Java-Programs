import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int integer=sc.nextInt();
			
			int sum=0; int product=1;int clone=integer; 

			for( ;integer!=0;integer=integer/10) {
				int digit=integer%10;
				sum=sum+digit;
				product=product*digit;
			}

			if(clone==sum+product) {
				System.out.println("Special two digit number ");
			}
			else {
				System.out.println("Not a Special two digit number");
			}
		}
}
