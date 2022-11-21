package JavaProjects;
import java.util.*;

public class p25LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int lcm=(num1>num2)?num1:num2;
		
		while(true) {
			if((lcm%num1==0) && (lcm%num2==0)) {
				System.out.println("LCM is "+lcm);
				break;
			}
			++lcm;
		}
		
	}

}
