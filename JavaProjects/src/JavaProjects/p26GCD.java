package JavaProjects;
import java.util.*;

public class p26GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		double num1=sc.nextInt();
		double num2=sc.nextInt();
		double gcd=0;
		
		for(double i=0;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd =i;
			}
		}
		System.out.println("GCD is "+gcd);

	}

}
