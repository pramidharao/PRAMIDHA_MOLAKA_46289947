package assignments;


public class Secondarm {

	public static void main(String[] args) {
		
		for(int  i =100 ;i< 1000 ;i++) {
			int n,r=0,result=0;
			n =i;
		while(n > 0) {
			r = n%10;
			result += (r*r*r);
			n /= 10;
		}
		if(i == result) {
			System.out.println(i + " is armstrong number");
		}
		
		}

	}

}

