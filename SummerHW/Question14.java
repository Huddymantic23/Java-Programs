import java.util.Scanner;

public class Question14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		
		for(int i=string.length()-1; i>=0; i--) {
			System.out.print(string.charAt(i));
		}
	}
}