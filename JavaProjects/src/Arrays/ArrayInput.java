package Arrays;
import java.util.*;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ar[]=new int[5];
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("Array elements is "+ar[i]+"\n");
		}

	}

}
