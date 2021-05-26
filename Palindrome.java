import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n,temp,r,sum=0;
		System.out.println("Enter a number");
		n=obj.nextInt();
		temp=n;
		while(temp>0)
		{
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(sum==n)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");

	}

}
