import java.util.Scanner;

public class PrimeNo_n {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		   System.out.println("Enter a number");
		   int n=obj.nextInt();
		   int i,j;
		   for(i=2;i<=n;i++)
		   {
			   boolean flag=false;
			   for(j=2;j<=i/2;j++)
			   {
				   if(i%j==0)
					   flag=true;
				   break;
			   }
			   if(flag==false&&i!=1)
				   System.out.print(i+" ");
		   }

	}

}
