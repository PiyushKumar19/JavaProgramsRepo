package Overridding;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Choose the bank : \n1.SBI \n2.ICICI \n3.Axis Bank : ");
		choice=sc.nextInt();
		if(choice==1) {
			SBI s=new SBI();
			s.getRateOfInterest();
		}
		else if(choice==2) {
			ICICI i=new ICICI();
			i.getRateOfInterest();
		}
		else if(choice==3) {
			AxisBank a=new AxisBank();
			a.getRateOfInterest();
		}
		else {
			System.out.println("Else condition.");
		}

	}

}
