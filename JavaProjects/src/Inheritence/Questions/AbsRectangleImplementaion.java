package Inheritence.Questions;
import java.util.*;

public class AbsRectangleImplementaion extends AbsRectangle {
	Scanner sc=new Scanner(System.in);
	double l, b;

	public void Enter() {
		System.out.println("Enter the length and breadth : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		
	}

	public void Show() {
		double area=l*b;
		System.out.println("Area of rectangle is : "+area);
		
	}

}
