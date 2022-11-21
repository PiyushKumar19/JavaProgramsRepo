package JavaProjects;

import java.util.Scanner;

public class BankAccount{
	
	Scanner sc =new Scanner(System.in);
	
	String Name;
	long AccountNo;
	String type;
	double Bal;
	
	public void Enter() {
		System.out.println("Enter the Name : ");
		Name=sc.next();
		System.out.println("Enter the account number : ");
		AccountNo=sc.nextLong();
		System.out.println("Enter the type : ");
		type=sc.next();
		System.out.println("Enter the balance in account : ");
		Bal=sc.nextDouble();
	}
	public void Depo() {
		double amount;
		System.out.println("Enter the amount to deposit : ");
		amount=sc.nextDouble();
		System.out.println("Amount deposited .");
		Bal=Bal+amount;
	}
	public void With() {
		double amount;
		System.out.println("Enter the amount to withdraw : ");
		amount=sc.nextDouble();
		if(Bal>amount) {
			Bal=Bal-amount;
			System.out.println("Amount withdrawn .");
		}
		else {
			System.out.println("Insufficient balance .");
		}
	}
	public void show() {
		System.out.println("Name is : "+Name);
		System.out.println("Account number is : "+AccountNo);
		System.out.println("Account type is : "+type);
		System.out.println("Account balance is : "+Bal);
	}
}
