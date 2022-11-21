package JavaProjects;
import java.util.*;

public class p30Bank {
	Scanner sc=new Scanner(System.in);
	
	String Name;
	long accountNo;
	long Bal=1000;
	long dep;
	long with;
	
	public void Enter() {
		System.out.println("Enter the name of account holder : ");
		Name=sc.next();
		System.out.println("Enter the account number : ");
		accountNo=sc.nextLong();
		System.out.println("Enter the name of account holder : ");
	}
	public void Depo() {
		System.out.println("Enter the amount to desposit : ");
		dep=sc.nextLong();
		Bal=Bal+dep;
	}
	public void Withdraw() {
		System.out.println("Enter the amount to withdraw : ");
		with=sc.nextLong();
		Bal=Bal-with;
	}
	public void Show() {
		System.out.println("name of account holder : "+Name);
		System.out.println("Account number : "+accountNo);
		System.out.println("Balance is : "+Bal);
	}

}
