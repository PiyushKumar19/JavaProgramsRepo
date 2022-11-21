package JavaProjects;
import java.util.*;

public class p21Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Sunday : ");
			break;
		case 2:
			System.out.println("Monday : ");
			break;
		case 3:
			System.out.println("Tuesday : ");
			break;
		case 4:
			System.out.println("Wednesday : ");
			break;
		case 5:
			System.out.println("Thrusday : ");
			break;
		case 6:
			System.out.println("Friday : ");
			break;
		case 7:
			System.out.println("Saturday : ");
			break;
		default:
			System.out.println("Invalid Entry  ");
			break;
		}

	}

}
