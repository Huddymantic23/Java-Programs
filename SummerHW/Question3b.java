import java.util.Scanner;

public class Question3b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double sum=0;
        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                sum-=(double) i/(i+1);
            }
            else {
                sum+=(double) i/(i+1);
            }
        }
        System.out.println("Sum : "+sum);
    }
}