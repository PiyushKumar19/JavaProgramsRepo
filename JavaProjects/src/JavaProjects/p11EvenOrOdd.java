package JavaProjects;
import java.util.*;

public class p11EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int even=0,odd=0;
		if(num%2==0) {
			even=even+2;
		}
		else {
			odd=odd+3;
		}
		System.out.println("Even and odd is : "+even+" "+odd);

	}

}
