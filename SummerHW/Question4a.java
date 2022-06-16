public class Question4a 
{
	public static void main(String[] args)
	{ 
        int a=1;
        for(int i=1; i<=5; i++) {
            int n=a;
            for(int j=1; j<=i; j++) {
                System.out.print(n+" ");
                n-=2;
            }
            a+=2;
            System.out.println();
        }
    }
}