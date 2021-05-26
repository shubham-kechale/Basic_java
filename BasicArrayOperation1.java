import java.util.Scanner;

public class BasicArrayOperation1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the element in an array");
		for(int i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		System.out.println("------Array element that you have entered------");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+" ");

	}

}
