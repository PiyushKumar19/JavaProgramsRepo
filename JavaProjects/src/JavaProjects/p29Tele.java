package JavaProjects;

import java.util.Scanner;

public class p29Tele {
	Scanner sc=new Scanner(System.in);

	double telNo;
	String serviceProvider;
	double charges;
	String CustomerName;
	String CustomerAddress;
	String CustomerEmail;
	
	public void Enter() {
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
	
	public void show() {
		System.out.println("\nTelephone number is "+telNo);
		System.out.println("service provider name is "+serviceProvider);
		System.out.println("Charges is "+charges);
		System.out.println("customer name is "+CustomerName);
		System.out.println("customer address is "+CustomerAddress);
		System.out.println("customer address is "+CustomerEmail);
	}
}
