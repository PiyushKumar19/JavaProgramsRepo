package JavaProjects;

class base{
	int RollNo=11;
}

public class Inheritence extends base {

	int EnrollNo=12345;
	
	public static void main(String[] args) {
		Inheritence i=new Inheritence();
		System.out.println("Enrollment number is : "+i.EnrollNo);
		System.out.println("Roll number is : "+i.RollNo);

	}

}
