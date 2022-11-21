package Inheritence.AbstractClasses;
import java.util.*;

public class OperationsImplementation extends SomeOperationsAbstract {
	Scanner sc=new Scanner(System.in);

	void Rect() {
		System.out.println("Enter the length and breadth : ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double ar=2*(l+b);
		System.out.println("Area of rectangle is : "+ar);
		
	}

	void Cir() {
		System.out.println("Enter the radius : ");
		double r=sc.nextDouble();
		double ar=3.14*r*r;
		System.out.println("Area of circles is : "+ar);
		
	}

	void simpleInterest() {
		System.out.println("Enter the amount, rate and time : ");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		double si=(p*r*t)/100;
		System.out.println("Simple interest is : "+si);
		
	}

}
