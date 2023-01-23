package stringasssignment;

public class Insert {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("It is used to _ at the specified index position");
		int a =sb1.indexOf("_");
		System.out.println(a);
		StringBuilder sb2 = new StringBuilder();
		sb2 = sb1.insert( sb1.indexOf("_"),"insert Text");
		System.out.println(sb2);

	}

}
