package JavaProjects;
import java.util.*;

public class p9PercentageAndGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of five subjects : ");
		double m1=sc.nextDouble();
		double m2=sc.nextDouble();
		double m3=sc.nextDouble();
		double m4=sc.nextDouble();
		double m5=sc.nextDouble();
		
		double per=(m1+m2+m3+m4+m5)/5;
		if((per<99)&&(per>80))
		{
			System.out.println("Your grade is A");
		}
		else if((per<79)&&(per>60)) {
			System.out.println("Your grade is B");
		}
		else if((per<59)&&(per>45)) {
			System.out.println("Your grade is C");
		}
		else {
			System.out.println("Your grade is D");
		}

	}

}
