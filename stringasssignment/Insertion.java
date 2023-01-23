package stringasssignment;

public class Insertion {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("It is used to _ at the specified index position");
		int a =str1.indexOf("_");
		System.out.println(a);
		StringBuffer s = new StringBuffer();
		s =str1.insert( str1.indexOf("_"),"insert Text");
		System.out.println(s);
	}

}
