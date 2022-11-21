package Arrays;
import java.util.*;

public class MarksOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double marks[]=new double[5];
		System.out.println("Enter the marks of students : ");
		for(int i=0; i<marks.length; i++)
		{
			marks[i]=sc.nextInt();
		}
		double sum=0;
		for(int i=0; i<marks.length; i++)
		{
			sum+=marks[i];
		}
		double per=sum/5;
		System.out.println("Marks of student are : ");
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]+" ");
		}
		System.out.println("Percentage is : "+per);

	}

}
