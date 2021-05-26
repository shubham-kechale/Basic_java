import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n,i,flag=0;
		System.out.println("Enter a number");
		n=obj.nextInt();
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Number is prime.");
		if(flag==1)
			System.out.println("Number is not prime.");

	}

}
