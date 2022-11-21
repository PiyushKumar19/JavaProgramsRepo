package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int i=5/2;
			// int i = 5/0;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("Finally case is caught.");
		}
	}

}
