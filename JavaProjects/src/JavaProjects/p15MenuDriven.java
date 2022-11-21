package JavaProjects;
import java.util.*;

public class p15MenuDriven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter 1.To Find armstrong of number \n2.To find fibonacci series \n3.To find factorial \n4.To exit : ");
			choice=sc.nextInt();
			
		if(choice==1)
		{
			System.out.println("Enter the number : ");
			int n=sc.nextInt();
			int sum=0,r=0,temp=n;
			while(n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if(sum==temp)
			{
				System.out.println("Number is armstrong .");
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter the number : ");
			int n=sc.nextInt();
			int t1=0,t2=1,sum=0;
			System.out.println("Fibonacci series is : ");
			for(int i=0;i<n;i++)
			{
				System.out.println(t1);
				sum=t1+t2;
				t1=t2;
				t2=sum;
			}
		}
		else if(choice==3)
		{
			System.out.println("Enter the number : ");
			int n=sc.nextInt();
			int fact=1;
			while(n>0) {
				fact=fact*n;
				n--;
			}
			System.out.println("Factorial of number is : "+fact);
		}
		else {
			System.out.println("Invalid choice .");
		}
		}
		while(choice!=4);

	}

}
