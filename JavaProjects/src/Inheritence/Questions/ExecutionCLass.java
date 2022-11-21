package Inheritence.Questions;
import java.util.*;

public class ExecutionCLass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Enter 1.To get a greeting from interface \n2.To find rectangle area with abstract method \n3.To find area of circle with non-abstract method \n4.To find si with multiple inheritence \n5.To end operations : ");
			choice=sc.nextInt();
			if(choice==1) {
				GreetRepo g=new GreetRepo();
				g.Greet();
			}
			else if(choice==2) {
				AbsRectangleImplementaion a=new AbsRectangleImplementaion();
				a.Enter();
				a.Show();
			}
			else if(choice==3) {
				AbsCircleImplementation a=new AbsCircleImplementation();
				a.Enter();
				a.area();
			}
			else if(choice==4) {
				SI_Implementation s=new SI_Implementation();
				s.si();
				s.enterSide();
			}
			else {
				break;
			}
		}while(choice!=5);

	}

}
