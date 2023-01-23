package exceptionhandling;


public class Arithmetic {

	public static void main(String[] args) {
		
		try {
			int a =7;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException ex) {
			System.out.println("Division by zero is not possible");
		}
	}

}
