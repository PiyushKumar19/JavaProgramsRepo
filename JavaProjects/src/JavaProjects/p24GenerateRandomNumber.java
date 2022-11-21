package JavaProjects;
import java.util.*;
import java.util.random.*;

public class p24GenerateRandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("Enter the upto which you want to find random integer : ");
		int num=sc.nextInt();
		
		int ran1=rand.nextInt(num);
		System.out.println("Random number is "+ran1);

	}

}
