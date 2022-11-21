package Interface;
import java.util.*;

public class ImpleEmployee {
	
	Scanner sc=new Scanner(System.in);
	
	String Name;
	double salary;
	
	void Enter() {
		System.out.println("Enter the Name : ");
		Name=sc.next();
		System.out.println("Enter the salary : ");
		salary=sc.nextDouble();
	}
	void disp() {
		System.out.println("Name is : "+Name);
	}
}
