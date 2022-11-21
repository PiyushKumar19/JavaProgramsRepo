package JavaProjects;
import java.util.Scanner;

public class p8Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1. To swap with third variable \n2. To swap without third variable : ");
		int choice=sc.nextInt();
		System.out.println("Entre the two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(choice==1) {
			int temp=a;
			a=b;
			b=temp;
			System.out.println("After swapping is "+a+" "+b);
		}
		else if(choice==2){
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After swapping without third variable is "+a+" "+b);
		}
		else {
			System.out.println("Invalid choice .");
		}

	}

}
