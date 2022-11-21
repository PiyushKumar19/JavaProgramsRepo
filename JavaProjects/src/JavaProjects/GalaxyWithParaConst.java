package JavaProjects;
import java.util.*;

public class GalaxyWithParaConst {
	
	int stars;
	String Name;
	
	GalaxyWithParaConst(int s, String N){
		stars=s;
		Name=N;
	}
	public void show() {
		System.out.println("Number of star is : "+stars);
		System.out.println("Name of star is : "+Name);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of star : ");
		int n=sc.nextInt();
		System.out.println("Number of star is : ");
		String name=sc.next();
		GalaxyWithParaConst g=new GalaxyWithParaConst(n, name);
		g.show();

	}

}
