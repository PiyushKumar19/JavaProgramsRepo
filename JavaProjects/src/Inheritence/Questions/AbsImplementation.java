package Inheritence.Questions;
import java.util.*;

public class AbsImplementation extends AbsRectangle {
	Scanner sc=new Scanner(System.in);
	double l, b;
	void Enter() {
		System.out.println("Enter the length and breadth : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
	}

	void Show() {
		double area=l*b;
		System.out.println("Area of rectangle is : "+area);
		
	}
}
