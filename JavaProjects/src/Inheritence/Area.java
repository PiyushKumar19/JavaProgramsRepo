package Inheritence;
import java.util.*;

public class Area {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		
		int choice;
		System.out.println("Enter the choice 1.To find area of rectangle \n2.To find arae of triangle : ");
		choice=sc.nextInt();
		if(choice==1) {
			t.enterRect();
			t.showRect();
			
		}
		else if(choice==2) {
			t.Enter();
			t.show();
		}
		else {
			System.out.println("Invalid choice .");
		}

	}

}
