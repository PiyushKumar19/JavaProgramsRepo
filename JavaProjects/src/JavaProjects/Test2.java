package JavaProjects;
import java.util.*;

public class Test2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount();
		
		System.out.println("Enter Details : ");
		b.Enter();
		
		int choice;
		
		do {
			System.out.println("Enter 1.To deposit \n2.To Withdraw \n3.To Show account details : ");
			choice=sc.nextInt();
			if(choice==1) {
				b.Depo();
			}
			else if(choice==2) {
				b.With();
			}
			else if(choice==3) {
				b.show();
			}
			else {
				System.out.println("Invalid choice .");
			}
		}
		while(choice!=4);
		

	}

}
