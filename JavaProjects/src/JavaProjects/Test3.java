package JavaProjects;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("Enter 1.To check prime number or not \n2.To check perfect number or not \n3.To end operations : ");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the number : ");
				int n=sc.nextInt();
				int flag=0;
				for(int i=2; i<n/2; i++) {
					if(n%i==0) {
						flag=1;
						break;
					}
				}
				if(flag==1) {
					System.out.println("It is not a prime number .");
				}
				else {
					System.out.println("It is a prime number .");
				}
			}
			else if(choice==2) {
				System.out.println("Enter the number : ");
				int n=sc.nextInt();
				int sum =0;
				for(int i=1;i<n;i++) {
					if(n%i==0) {
						sum=sum+i;
					}
				}
				if(sum==n) {
					System.out.println("It is a perfect number .");
				}
				else {
					System.out.println("It is not a perfect number .");
				}
			}
		}
		while(choice!=4);

	}

}
