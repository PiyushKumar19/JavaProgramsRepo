package Inheritence;
import java.util.*;

public class Triangle extends Rectangle{
	Scanner sc=new Scanner(System.in);
	
	double base, height, area;
	
	public void Enter() {
		System.out.println("Enter the base and height of triangle : ");
		base=sc.nextDouble();
		height=sc.nextDouble();
	}
	public void show() {
		area=0.5*base*height;
		System.out.println("Area of triangle is : "+area);
	}
}
