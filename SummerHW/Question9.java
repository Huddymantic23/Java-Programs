import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();

		int i=0; int j=string.length()-1;
		boolean check=true;
		while(j>=0) {
			if(string.charAt(i) != string.charAt(j)) {
				check=false;
				System.out.println("Not String Palindrome !");
				break;
			}
			i++;
			j--;
		}
		if(check) {
			System.out.println("String Palindrome !");
		}
	}
}