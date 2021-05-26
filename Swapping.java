import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two numbers");
		a=obj.nextInt();
		b=obj.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Before swapping a="+b+" b="+a);
		System.out.println("After swapping a="+a+" b="+b);

	}

}
