package JavaProjects;
import java.util.Scanner;

public class p7MenuDriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1. to find area of rectangle \n2. To find area of circle : ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the length and breadth : ");
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			int area=length*breadth;
			System.out.println("Area of rectangle is : "+area);
		}
		else if(choice==2){
			System.out.println("Enter the radius : ");
			float radius=sc.nextFloat();
			float area=(float) ((3.14)*radius*radius);
			System.out.println("Area is : "+area);
		}
		else {
			System.out.println("Invalid choice");
		}

	}

}
