package assignments;

import java.util.*; 

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original,remainder,result = 0;
		original =n;
		while(original != 0)
		{
			remainder = original%10;
			result += Math.pow(remainder,3);
			original /= 10;
		}
		if(result == n) {
			System.out.println(n + " is  armstrong number");
		}
		else
		{
			System.out.println(n + " is not an armstrong number");
		}
     sc.close();
	}

}
