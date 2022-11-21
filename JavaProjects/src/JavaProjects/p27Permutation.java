package JavaProjects;
import java.util.*;

public class p27Permutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.next();
		
		System.out.println("Enter the selected items : ");
		String sel=sc.next();
		int r=sel.length();
		
		int n=str.length();
		
		int f1=1,f2=1,j=1;
		
		while(j<=n) {
			f1=f1*j;
			j++;
		}
		while(j<=n-r) {
			f2=f2*j;
			j++;
		}
		int result=f1/f2;
		System.out.println("Permutation is "+result);

	}

}
