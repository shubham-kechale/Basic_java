import java.util.Scanner;

public class BasicFunctionOverloading {
	public static void add(int i,float f)

	{
		System.out.println("Addition:"+(i+f));
	}
	public static void add(int i,int f)

	{
		System.out.println("Addition:"+(i+f));
	}
	public static void add(int i,int f,double d)

	{
		System.out.println("Addition:"+(i+f+d));
	}
	public static void add(int i,float f,int a)

	{
		System.out.println("Addition:"+(i+f+a));
	}
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
        add(3,4.5f);
        add(145,78);
        add(25,10,14.50);
        add(10,23.25f,56);

	}

}
