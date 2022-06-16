import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args)
	{ 
		System.out.println("Select a shape");
		System.out.println("Cube :: 1 , Sphere :: 2 , cubiod  :: 3");
		Scanner scanner=new Scanner(System.in);
		int integer=scanner.nextInt();

		switch(integer) 
		{
			case 1:
				System.out.println("Enter your side :");
				double side=scanner.nextDouble();

				System.out.println("Volume : "+Math.pow(side, 3));
			break;
			case 2:
				System.out.println("Enter radius :");
				double radius=scanner.nextDouble();
				double con=1.333333;
				System.out.println("Volume : "+con*Math.PI*Math.pow(radius, 3));
			break;
			case 3:
				System.out.println("Enter your length :");
				double l=scanner.nextDouble();				
				System.out.println("Enter your breadth:");
				double b=scanner.nextDouble();
				System.out.println("Enter your height":);
				double h=scanner.nextDouble();		
				System.out.println("Volume : "+l*b*h);		
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}
