import java.util.Scanner;

public class PowerOfNo {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int n,p,sum=1;
		System.out.println("Enter a number");
		n=obj.nextInt();
		System.out.println("Enter the power that we want to find");
		p=obj.nextInt();
		int t=p;
		while(p!=0)
		{
			sum=sum*n;
			p--;
		}
          System.out.println(n+"^"+t+" ="+sum);

	}

}
