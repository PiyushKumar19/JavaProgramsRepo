package JavaProjects;
import java.util.*;

public class p17PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int temp=n,sum=0;
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==temp) {
			System.out.println("It is a perfect number .");
		}
		else {
			System.out.println("It is not a perfect number .");
		}

	}

}
