import java.util.Scanner;

public class Question15 
{
	static boolean diff(int a, int n) 
	{
		return a-n==2 || a-n==-2;
	}
	static boolean prime(int integer)
	{
		for(int i=2;i<=integer/2;i++) 
		{
			if(integer%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your two numbers ");
		int first=sc.nextInt();
		int n=sc.nextInt();
		
		if(diff(first, n) && prime(first) && prime(n)) 
		{
			System.out.println("They are twin-prime number");
		}
		else 
		{
			System.out.println("They are not twin-prime number");
		}
	}
}