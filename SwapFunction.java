import java.util.Scanner;

public class SwapFunction {
	public static void swap(int[]a)
	{
		int temp;
		temp=a[0];
		a[0]=a[1];
		a[1]=temp;
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        int[]arr= {a,b};
        System.out.println("Before swapping: a="+a+" b="+b);
        swap(arr);
        System.out.println("After swapping: a="+arr[0]+" b="+arr[1]);

	}

}
