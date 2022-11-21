package JavaProjects;

public class p13 {

	public static void main(String[] args) {
		int i=5;
		System.out.println("From for loop : ");
		for(i=5;i<=5000;i++) {
			System.out.println(i);
		}
		System.out.println("From while loop : ");
		while(i<5000) {
			System.out.println(i);
			i++;
		}
		System.out.println("From do-while loop : ");
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<5000);

	}

}
