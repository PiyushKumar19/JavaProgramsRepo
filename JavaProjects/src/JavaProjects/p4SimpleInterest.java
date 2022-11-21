package JavaProjects;
import java.util.*;

public class p4SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time, amount and interest : ");
		float time=sc.nextFloat();
		float amount=sc.nextFloat();
		float interest=sc.nextFloat();
		float si=(amount*time*interest)/100;
		System.out.println("Simple interest is : "+si);

	}

}
