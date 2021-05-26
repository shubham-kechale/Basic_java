import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter a number");
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("summation of 1 to "+n+" is "+sum);

	}

}
