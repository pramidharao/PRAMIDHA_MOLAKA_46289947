package stringasssignment;

public class ReverseByUsBuilder {

	public static void main(String[] args) {
		StringBuilder rev = new StringBuilder ("This method returns the reversed object on which it was called.");
		StringBuilder rev1 =rev.reverse();
		System.out.println(rev1);
	}

}
