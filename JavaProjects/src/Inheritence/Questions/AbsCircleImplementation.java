package Inheritence.Questions;

public class AbsCircleImplementation extends AbsCircle {
	double r;
	public void area() {
		double area=3.14*r*r;
		System.out.println("Area of circle is : "+area);
	}
}
