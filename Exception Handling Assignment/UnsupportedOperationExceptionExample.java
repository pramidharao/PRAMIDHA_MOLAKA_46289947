package exceptionhandling;


public class UnsupportedOperationExceptionExample {

	public static void main(String[] args) {
	try {	
		int a =7;
		int b = 0;
		System.out.println(a/b);
	}
		catch(UnsupportedOperationException ex) {
			System.out.println("Division by zero is not possible");
		}
	}
	

}
