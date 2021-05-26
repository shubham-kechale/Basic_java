import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>b&&a>c)
				System.out.println("Greatest number is "+a);
		else if(b>c)
			System.out.println("Greatest number is "+b);
		else if(c>a&&c>b)
			System.out.println("Greatest number is "+c);
		else 
			System.out.println("numbers are equal");

	}

}
