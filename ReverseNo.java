import java.util.*;
public class ReverseNo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int temp=n;
		System.out.println("-------number in reverse order------------");
		while(temp!=0)
		{
			System.out.print(temp%10+" ");
			temp=temp/10;
		}

	}

}
