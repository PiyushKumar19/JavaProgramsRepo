package JavaProjects;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter 1.To check armstrong or not \n2.To find fibonacci series \n3.Find percentage and find grade : ");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the number : ");
				int n=sc.nextInt();
				int sum=0,r=0;
				int temp=n;
				while(n>0) {
					r=n%10;
					sum=sum+(r*r*r);
					n=n/10;
				}
				if(sum==temp) {
					System.out.println("Number is armstrong .");
				}
				else {
					System.out.println("Number is not armstrong .");
				}
			}
			else if(choice==2) {
				System.out.println("Enter the number : ");
				int n=sc.nextInt();
				int n1=0,n2=1,n3;
				for(int i=0; i<n; i++) {
					n3=n1+n2;
					System.out.println(n1);
					n1=n2;
					n2=n3;
				}
			}
			else if(choice==3) {
				System.out.println("Enter the marks : ");
				double m1=sc.nextDouble();
				double m2=sc.nextDouble();
				double m3=sc.nextDouble();
				double m4=sc.nextDouble();
				double m5=sc.nextDouble();
				
				double per=(m1+m2+m3+m4+m5)/5;
				if(per<100&&per<90) {
					System.out.println("A grade .");
				}
				else if(per<90&&per<60) {
					System.out.println("B grade .");
				}
				else if(per<60&&per>40) {
					System.out.println("C grade .");
				}
				else if(per<40){
					System.out.println("Fail ");
				}
			}
			else {
				System.out.println("Operations ended .");
				break;
			}
		}
		while(choice!=4);

	}

}
