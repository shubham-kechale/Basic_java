import java.util.Scanner;

public class BasicArrayOperation2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the element in an array");
		for(int i=0;i<arr.length;i++)
			arr[i]=obj.nextInt();
		System.out.println("------Array element that you have entered in revered order------");
		for(int i=(arr.length-1);i>=0;i--)
			System.out.println(arr[i]+" ");

	}

}
