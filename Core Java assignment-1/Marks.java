package assignments;
import java.util.*;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		if (s1 > 60 && s2>60 && s3 > 60 && s4 >60) {
			System.out.println("Passed");
		}
		else if((s1> 60 && s2 >60)|| (s2>60 && s3>60)||(s3>60 && s4>60)||
		(s1>60 &&s3 > 60) || (s1 >60 && s4 > 60)) {
			System.out.println("Promoted");
		}
		else if(s1 <60 || s2 <60 || s3 <60 || s4 < 60){
			System.out.println("Failed");
		}
		sc.close();
	}

}
