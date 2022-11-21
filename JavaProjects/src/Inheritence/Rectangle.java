package Inheritence;
import java.util.*;

public class Rectangle {
	Scanner sc=new Scanner(System.in);
	
	double length;
	double breadth, RectArea;
	
	public void enterRect() {
		System.out.println("Enter the length and breadth of rectangle : ");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	public void showRect() {
		RectArea=2*(length+breadth);
		System.out.println("Area of rectangle is : "+RectArea);
	}
}
