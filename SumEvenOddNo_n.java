import java.util.Scanner;

public class SumEvenOddNo_n {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n,i,even=0,odd=0;
		System.out.println("Enter a number");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				even=even+i;
			else
				odd=odd+i;
		}
		System.out.println("sum of all even form 1 to "+n+" is "+even);
		System.out.println("sum of all odd form 1 to "+n+" is "+odd);

	}

}
