package ExceptionHandling;
import java.util.*;

public class ThrowKeyword {
	Scanner sc=new Scanner(System.in);
	
	public void divideByZero(int n) {
		if(n==0) {
			throw new ArithmeticException("Trying to divide by 0.");			
		}
		else {
			System.out.println("Number is not zero.");
		}
	}
//	public static void main(String[] args) {
//		int n;
//		System.out.println("Enter the divisor and divident : ");
//		n=sc.nextInt();
//		System.out.println("Entered.");
//		divideByZero(0);
//
//	}

}
