package Inheritence.AbstractClasses;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		OperationsImplementation o=new OperationsImplementation();
		MethodsWithPara m=new MethodsWithPara();
		System.out.println("Enter 1.To find area of rectangle \n2.To find area of circle \n3.To find simple interest : ");
		int choice=sc.nextInt();
		if(choice==1) {
			o.Rect();
			System.out.println("With parameterized method : ");
			m.Rect(2, 4);
		}
		else if(choice==2) {
			o.Cir();
			System.out.println("With parameterized method : ");
			m.Cir(11);
		}
		else if(choice==3) {
			o.simpleInterest();
			System.out.println("With parameterized method : ");
			m.simpleInterest(11, 12, 15);
		}
		else {
			System.out.println("Invalid choice.");
		}

	}

}
