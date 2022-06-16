import java.util.Scanner;

public class Question5 {
   
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers ");
		int arr[]=new int[10];
		for(int i=0; i<10; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted array");
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
			}
		}
		
		for(int i=0 ;i<n; i++) 
		{
			System.out.print(arr[i]+", ");
		}
    }
}