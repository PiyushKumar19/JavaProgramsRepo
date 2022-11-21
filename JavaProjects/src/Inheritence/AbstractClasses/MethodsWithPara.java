package Inheritence.AbstractClasses;

public class MethodsWithPara extends AbstractMethodsPara{

	void Rect(int l, int b) {
		double ar=2*(l+b);
		System.out.println("Area of rectangle is : "+ar);
		
	}

	void Cir(double r) {
		double ar=3.14*r*r;
		System.out.println("Area of circles is : "+ar);
		
	}

	void simpleInterest(double p, double r, double t) {
		double si=(p*r*t)/100;
		System.out.println("Simple interest is : "+si);
		
	}


}
