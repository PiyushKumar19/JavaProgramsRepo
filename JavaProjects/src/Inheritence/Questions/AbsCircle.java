package Inheritence.Questions;
import java.util.*;

public abstract class AbsCircle {
	Scanner sc=new Scanner(System.in);
	double r;
	AbsCircle(){
		System.out.println("Inside the abstract class with non-abstract menthod. ");
	}
	
	public void Enter() {
		System.out.println("Enter the radius : ");
		r=sc.nextDouble();
	}
	public abstract void area();
}
