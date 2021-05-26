import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int count=0,temp=n;
		while(temp!=0)
		{
			count++;
			temp/=10;
		} //System.out.println("count:"+count);
		temp=n;
		int sum=0;
		while(temp!=0)
		{
			int r=temp%10;  //System.out.println(r);
			sum=sum+power(r,count); //System.out.println("sum:"+sum);
			temp/=10;
		}
		if(sum==n)
			System.out.println("Number is armstrong number.");
		else 
			System.out.println("Number is not armstrong number.");

	}
     public static int power(int n,int p)
     {
    	 int sum=1;
    	 while(p!=0)
    	 {
    		 sum=sum*n;
    		 p--;
    	 }
    	 return sum;
     }

	}


