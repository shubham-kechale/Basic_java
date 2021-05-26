import java.util.Scanner;

public class BasicArrayOperation3 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i;
		System.out.println("Enter the array size");
		i=obj.nextInt();
		int [] arr=new int[i];
		System.out.println("Enter the elements in an array");
		for(i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		int num;
		System.out.println("Enter a number that you have to find in an array");
		num=obj.nextInt();
		int index=0;
		for(i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				index=1;
				break;
			}
		}
		if(index==1)
			System.out.println("Number is present in array");
		else
			System.out.println("Number is not present in array");

	}

}
