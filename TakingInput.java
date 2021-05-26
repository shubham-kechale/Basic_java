
import java.util.*;//Scanner class is declared in java.util package.
public class TakingInput {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);//creating a object of a Scanner class for taking the input from user
		int a; 
		System.out.println("Enter a number");
		a=obj.nextInt();
		String name;
		obj.nextLine();//for clearing the input buffer.
		System.out.println("Enter your name");
		name=obj.nextLine();
		int age;
		System.out.println("Enter your age");
		age=obj.nextInt();
		System.out.println("--------------------------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		obj.close();
	}

}
