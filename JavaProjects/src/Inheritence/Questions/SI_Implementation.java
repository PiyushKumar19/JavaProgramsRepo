package Inheritence.Questions;
import java.util.*;

public class SI_Implementation implements ISimpleInterest, ISquare {
	Scanner sc=new Scanner(System.in);
	public void si() {
		System.out.println("Enter the p, r and t : ");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		
		double s=(p*r*t)/100;
		System.out.println("Simple interest is : "+s);
	}


	public void enterSide() {
		System.out.println("Enter side : ");
		double s=sc.nextDouble();
		double ar=s*s;
		System.out.println("Area is : "+ar);
		
	}

}
