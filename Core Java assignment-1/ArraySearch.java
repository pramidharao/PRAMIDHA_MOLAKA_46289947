package assignments;

import java.util.*;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		int arr [] = new int [n];
		for(int i = 0; i< arr.length; i++ ) {
			arr[i]  = sc.nextInt();
		}
		Arrays.sort(arr);
		int key = sc.nextInt();
		for (int i =0 ; i< arr.length; i++) {
			if(arr[i] == key) {
				System.out.println(key + " element is found");
			}	
			
		}
		
		sc.close();
	}

}
