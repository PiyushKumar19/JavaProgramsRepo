package JavaProjects;
import java.util.*;

public class p19DoWhileBreak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Enter 1.To get greeting \n2.To end loop \n3.To skip iteration : ");
			int choice=sc.nextInt(); 
			if(choice==1) {
				System.out.println("Hello "+i);
			}
			else if(choice==2) {
				System.out.println("Loop ended.");
				break;
				
			}
			else if(choice==3) {
				System.out.println("Condition skipped ."+i);
				continue;
			}
			i++;
		}
		while(i<5);

	}

}
