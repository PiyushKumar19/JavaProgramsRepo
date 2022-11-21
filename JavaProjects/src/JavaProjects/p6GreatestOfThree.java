package JavaProjects;

import java.util.Scanner;

public class p6GreatestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>b)) {
			System.out.println(a+" is greatest .");
		}
		else if((b>a)&&(b>c)) {
			System.out.println(b+" is greatest .");
		}
		else {
			System.out.println(c+" is greatest .");
		}

	}
}
