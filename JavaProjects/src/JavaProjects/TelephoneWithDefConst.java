package JavaProjects;
import java.util.*;

public class TelephoneWithDefConst {
	
	double telNo;
	String serviceProvider;
	double charges;
	String CustomerName;
	String CustomerAddress;
	String CustomerEmail;
	
	Scanner sc=new Scanner(System.in);
	
	TelephoneWithDefConst(){
		System.out.println("Enter telephone number : ");
		telNo=sc.nextDouble();
		System.out.println("Enter service provider name : ");
		serviceProvider=sc.next();
		System.out.println("Enter charges : ");
		charges=sc.nextDouble();
		System.out.println("Enter customer name : ");
		CustomerName=sc.next();
		System.out.println("Enter customer address : ");
		CustomerAddress=sc.next();
		System.out.println("Enter customer email : ");
		CustomerEmail=sc.next();
	}
	
	void Show() {
		System.out.println("\nTelephone number is "+telNo);
		System.out.println("service provider name is "+serviceProvider);
		System.out.println("Charges is "+charges);
		System.out.println("customer name is "+CustomerName);
		System.out.println("customer address is "+CustomerAddress);
		System.out.println("customer address is "+CustomerEmail);
	}

	public static void main(String[] args) {
		
		TelephoneWithDefConst t=new TelephoneWithDefConst();
		t.Show();
	}

}
