package JavaProjects;
import java.util.*;

public class p10MenuDrivenOfAreas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To calculate : \n1. Area of right triangle \n2.Area of equilateral triangle \n3.Area of cylinder \n4.Area of square \n5.Area of rectangle : ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the lenght and height : ");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			double area=(l*b)/2;
			System.out.println("Area is : "+area+"cm^2");
		}
		else if(choice==2) {
			System.out.println("Enter the side of triangle : ");
			double a=sc.nextDouble();
			double area= (1.732/4)*(a*a);
			System.out.println("Area of equilateral triangle is "+area+"cm^2");
		}
		else if(choice==3) {
			System.out.println("Enter the height and radius of cylinder : ");
			double h=sc.nextDouble();
			double r=sc.nextDouble();
			double area= (2*3.14*r)*(h+r);
			System.out.println("Area of cylinder is : "+area+"cm^2");
		}
		else if(choice==4) {
			System.out.println("Enter the side of square : "+"cm^2");
			double a=sc.nextDouble();
			double area=a*a;
			System.out.println("Area of square is : "+area+"cm^2");
		}
		else if(choice==5) {
			System.out.println("Enter the length and breadth : ");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			double area= l*b;
			System.out.println("Area is : "+area+"cm^2");
		}
		else {
			System.out.println("Invalid choice");
		}

	}

}
