package JavaProjects;
import java.util.*;

public class p16PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("It is not a prime number .");
		}
		else {
			System.out.println("It is a prime number .");
		}

	}

}
