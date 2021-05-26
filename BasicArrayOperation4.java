import java.util.Scanner;

public class BasicArrayOperation4 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int i;
		System.out.println("Enter the size of array");
		i=obj.nextInt();
		int[]arr =new int[i];
		System.out.println("Enter the elements in an array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		int max=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		float sum=0;
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		float avg=sum/arr.length;
		System.out.println("Sum of all elements in an array:"+sum);
		System.out.println("Average of an array:"+avg);
		System.out.println("maximum number in an array:"+max);
		System.out.println("minmum number in an array:"+min);

	}

}
