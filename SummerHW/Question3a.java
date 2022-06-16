import java.util.Scanner;

public class Question3a 
{
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();

		double sum=0;
		for(int i=1;i<=n;i++) 
		{
			int factorial=1;
			for(int j=1;j<=i;j++) 
			{
				factorial=factorial*i;
			}
			double r=a/factorial;
			if(i%2==0)
			{
				sum-=r;
			}
			else 
			{
				sum+=r;
			}
		}
		System.out.println("Sum : "+sum);
	}
}
