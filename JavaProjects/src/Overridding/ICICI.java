package Overridding;
import java.util.Scanner;

public class ICICI extends Banks {
	Scanner sc=new Scanner(System.in);
	double i;
	double amount;

	double getRateOfInterest() {
		i=8.0;
		System.out.println("Enter amount : ");
		amount=sc.nextDouble();
		double total=amount+(amount*i)/100;
		System.out.println("Amount is : "+total);
		return 0;
	}
	
}
