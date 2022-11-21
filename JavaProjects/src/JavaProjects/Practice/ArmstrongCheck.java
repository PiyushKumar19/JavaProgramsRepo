package JavaProjects.Practice;
import java.util.*;
import java.math.*;

class Armstrong{
	public void arm(int n) {
		int temp=n,sum=0,i=0,r=0;
		while(n>0) {
			n/=10;
			i++;
		}
		while(n>0) {
			r=n%10;
			sum+=Math.pow(r, i);
			n/=10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number .");
		}
		else {
			System.out.println("Not Armstrong number .");
		}
	}
}

public class ArmstrongCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		Armstrong a=new Armstrong();
		a.arm(num);

	}

}
