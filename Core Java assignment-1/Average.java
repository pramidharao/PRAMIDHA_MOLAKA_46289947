package assignments;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s1[]= new int[n];
		int s2[]= new int[n];
		int s3[]= new int[n];
        for(int  i =0; i< n ;i++) {
        	 s1[i] = sc.nextInt();
		}
		
        for(int  i =0; i< n ;i++) {
        	s2[i] = sc.nextInt();
		}
        for(int  i =0; i< n ;i++) {
        	s3[i] = sc.nextInt();
		}
		
			int sum1 = 0,sum2 =0,sum3=0;
	        for(int i = 0; i<n;i++) {
	        	sum1 += s1[i];
	        }
	        for(int i = 0; i<n;i++) {
	        	sum2 += s2[i];
	        }
	        
	        for(int i = 0; i<n;i++) {
	        	sum3 += s3[i];
	        }
	        
		
        
        
        sc.close();

	}

}
