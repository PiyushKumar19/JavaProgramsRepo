package JavaProjects;
import java.util.*;

public class BankWithParaConst {
	
	Scanner sc=new Scanner(System.in);
	
	String Name;
	long AccountNo;
	String type;
	double Bal;
	
	BankWithParaConst(String n, long a){
		Name=n;
		AccountNo=a;
		System.out.println("Enter the type : ");
		type=sc.next();
		System.out.println("Enter the balance in account : ");
		Bal=sc.nextDouble();
	}
	
	void Enter() {
		System.out.println("Enter the balance in account : ");
		Bal=sc.nextDouble();
		System.out.println("Enter the type of account : ");
		type=sc.next();
	}
	public void show() {
		System.out.println("\nName is : "+Name);
		System.out.println("Account number is : "+AccountNo);
		System.out.println("Account type is : "+type);
		System.out.println("Account balance is : "+Bal);
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

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String n=sc.next();
		System.out.println("Enter the account no : ");
		long a=sc.nextLong();
		BankWithParaConst b=new BankWithParaConst(n, a);
		
		int choice;
		System.out.println("Enter 1.To Deposit \n2.To Withdraw \n3.To Show Details : ");
		choice=sc.nextInt();
		if(choice==1) {
			b.Depo();
			b.show();
		}
		else if(choice==2){
			b.With();
			b.show();
		}
		else {
			b.show();
		}

	}

}
