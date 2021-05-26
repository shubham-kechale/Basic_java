import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		  Scanner obj=new Scanner(System.in);
		  
		   System.out.println("1.Pen");
		   System.out.println("2.Pencil");
		   System.out.println("3.Notebook");
		   System.out.println("4.bottle");
		   System.out.println("5.ColorBox");
		   System.out.println("6.Exit");
		   
		   int total,a=0,b=0,c=0,d=0,e=0;
		   boolean flag=true;
		   while(flag!=false) 
		   {
			   System.out.println("------------------------------------------------");
			   System.out.println("Enter your choice");
			   int choice=obj.nextInt();
		   switch(choice)
		   {
		   case 1:
			   System.out.println("How many quantity do want?");
			    a=obj.nextInt();
			   a*=10;
			   break;
		   case 2:
			   System.out.println("How many quantity do want?");
			    b=obj.nextInt();
			   b*=5;
			   break;
		   case 3:
			   System.out.println("How many quantity do want?");
			    c=obj.nextInt();
			   c*=20;
			   break;
		   case 4:
			   System.out.println("How many quantity do want?");
			    d=obj.nextInt();
			   d*=30;
			   break;
		   case 5:
			   System.out.println("How many quantity do want?");
			    e=obj.nextInt();
			   e*=50;
			   break;
		   case 6:
			    flag=false;
			    break;
		   default:
			   System.out.println("invalid choice");
		   }
		   }
		   total=a+b+c+d+e;
		   System.out.println("---------------------------------------------");
		   System.out.println("Total cost:"+total);
		   

	}

}
