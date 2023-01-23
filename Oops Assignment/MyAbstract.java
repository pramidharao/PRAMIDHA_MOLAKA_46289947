package oops;

abstract class MyClass
{
	public void display() {
		System.out.println("this is a method of abstract class");
	}
}
public class MyAbstract extends MyClass{

	public static void main(String[] args) {
		new MyAbstract().display();
	}
}