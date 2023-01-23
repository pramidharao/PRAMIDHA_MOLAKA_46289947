package stringasssignment;

public class Operations {
	
	public static void main(String[] args) {
		String str1 = "Java String pool refers to collection of Strings which are stored in heap memory"; 
		String s;
		s = str1.toLowerCase();
		System.out.println(s);
		s =str1.toUpperCase();
		System.out.println(s);
		s =str1.replace('a','$');
		System.out.println(s);
		Boolean s1= str1.contains("collection");
		System.out.println(s1);
		String temp = str1;
		if(temp == str1) {
			System.out.println("matches with original string");
		}
		if(temp.equals(str1)) {
			System.out.println("matches with original string");
		}	
	}
}
