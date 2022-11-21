package JavaProjects;

public class p12Loop10To10000 {

	public static void main(String[] args) {
		int i=10;
		System.out.println("From for loop : ");
		for(i=10;i<=10000;i++) {
			System.out.println(i);
		}
		System.out.println("From while loop : ");
		while(i<10000) {
			System.out.println(i);
			i++;
		}
		System.out.println("From do-while loop : ");
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<10000);

	}

}
