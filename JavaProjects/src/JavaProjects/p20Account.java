package JavaProjects;
import java.util.*;

public class p20Account {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		p30Bank b=new p30Bank();
		b.Enter();
		int choice;
		System.out.println("Enter 1.To Deposit \n2.To Withdraw \n3.To Show Details : ");
		choice=sc.nextInt();
		if(choice==1) {
			b.Depo();
			b.Show();
		}
		else if(choice==2){
			b.Withdraw();
			b.Show();
		}
		else {
			b.Show();
		}

	}

}
