import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();

		for (int i=0; i<string.length(); i++) {
			char character=string.charAt(i);
			int operation=(int)character-32;
			character=(char)operation;
			if((int)character==83) {
				System.out.print("\n");
			}
			else {
				System.out.print(character);
			}
		}
	}
}