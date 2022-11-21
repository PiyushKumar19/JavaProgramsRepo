package JavaProjects;
import java.util.*;

public class p3AverageOfFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the five numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int avg=(a+b+c+d+e)/5;
		System.out.println("Average of five numbers is : "+avg);

	}

}
