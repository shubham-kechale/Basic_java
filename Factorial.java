import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n;
		long sum=1;
		System.out.println("Enter a number");
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println("Factorial of "+n+" is "+sum);

	}

}
